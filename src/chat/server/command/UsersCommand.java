package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

import java.io.IOException;
import java.util.List;

public class UsersCommand implements Command{
    private final SessionManager sessionManager;

    public UsersCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void excute(String[] args, Session session) throws IOException {
        List<String> usernames = sessionManager.getAllUsername();
//            StringBuffer sb= new StringBuffer(); // 멀티스레드인 상황에서 사용 추천
        StringBuilder sb= new StringBuilder(); // 단일스레디인 상황에서 사용 추천
        sb.append("전체 접속자 : ").append(usernames.size()).append("\n");
        for (String useranme : usernames){
            sb.append(" - ").append(useranme).append("\n");
        }
        session.send(sb.toString());
    }
}
