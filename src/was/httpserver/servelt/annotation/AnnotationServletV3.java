package was.httpserver.servelt.annotation;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationServletV3 implements HttpServlet {

    private final Map<String, ControllerMehtod> pathMap;

    public AnnotationServletV3(List<Object> controllers) {
        this.pathMap = new HashMap<>();
        initializePathMap(controllers);
    }

    private void initializePathMap(List<Object> controllers) {
        for (Object controller : controllers) {
            Method[] methods = controller.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Mapping.class)) {
                    String path = method.getAnnotation(Mapping.class).value();

                    // 중복 체크 경로
                    if (pathMap.containsKey(path)){
                        ControllerMehtod controllerMehtod = pathMap.get(path);
                        throw new IllegalStateException("경로 중복 등록, path=" + path + ", method=" + method + ", 이미 등록된 메서드= " + controllerMehtod.method);
                    }

                    pathMap.put(path, new ControllerMehtod(controller, method));

                }
            }
        }
    }

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();

        ControllerMehtod controllerMehtod = pathMap.get(path);

        if (controllerMehtod == null) {

            throw new PageNotFoundException("request = " + path);
        }
        controllerMehtod.invoke(request, response);


    }


    private static class ControllerMehtod {
        private final Object controller;
        private final Method method;

        private ControllerMehtod(Object controller, Method method) {
            this.controller = controller;
            this.method = method;
        }

        public void invoke(HttpRequest request, HttpResponse response) {

            Class<?>[] parameterTypes = method.getParameterTypes();
            Object[] args = new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                if (parameterTypes[i] == HttpRequest.class) {
                    args[i] = request;
                } else if (parameterTypes[i] == HttpResponse.class) {
                    args[i] = response;
                } else {
                    throw new IllegalArgumentException("Unsupported parameter type: " + parameterTypes[i]);
                }

            }

            try {
                method.invoke(controller, args);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
