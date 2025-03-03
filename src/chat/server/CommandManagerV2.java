package chat.server;

import java.io.IOException;
import java.util.List;

public class CommandManagerV2 implements  CommandManager{
    private final SessionManager sessionManager;
    private static final  String DELIMITER = "\\|";

    public CommandManagerV2(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String totalMessage, Session session) throws IOException {

        if (totalMessage.startsWith("/join")){
            String[] split = totalMessage.split(DELIMITER);
            String username = split[1];
            session.setUsername(username);
            sessionManager.sendAll(username + "님이 입장했습니다.");
        } else if (totalMessage.startsWith("/message")) {
            String[] split = totalMessage.split(DELIMITER);
            String message = split[1];

            sessionManager.sendAll("[" + session.getUsername() + "] " + message);
        } else if(totalMessage.startsWith("/change")){
            String[] split = totalMessage.split(DELIMITER);
            String changeName = split[1];
            sessionManager.sendAll(session.getUsername() + "님이 " + changeName + "로 이름을 변경했습니다.");
            session.setUsername(changeName);
        } else if (totalMessage.startsWith("/users")){
            List<String> usernames = sessionManager.getAllUsername();
//            StringBuffer sb= new StringBuffer(); // 멀티스레드인 상황에서 사용 추천
            StringBuilder sb= new StringBuilder(); // 단일스레디인 상황에서 사용 추천
            sb.append("전체 접속자 : ").append(usernames.size()).append("\n");
            for (String useranme : usernames){
                sb.append(" - ").append(useranme).append("\n");
            }
            session.send(sb.toString());
        } else if (totalMessage.startsWith("/exit")){
            throw new IOException("exit");
        } else {
            session.send("처리할 수 없는 명령어 입니다: " + totalMessage);
        }

    }
}
