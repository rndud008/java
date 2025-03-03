package was.v7;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.servelt.annotation.Mapping;

public class SiteControllerV7 {
    @Mapping("/")
    public void home(HttpRequest request, HttpResponse response){
        response.writeBody("<h1>home</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li><a href='/site1'>site1</a></li>");
        response.writeBody("<li><a href='/site2'>site2</a></li>");
        response.writeBody("<li><a href='/search?q=hello'>search</a></li>");
        response.writeBody("</ul>");
    }

    @Mapping("/site1")
    public void site1(HttpRequest request, HttpResponse response){
        response.writeBody("<h1>Site1</h1>");
    }

    @Mapping("/site2")
    public void site2(HttpRequest request, HttpResponse response){
        response.writeBody("<h1>Site2</h1>");
    }
}
