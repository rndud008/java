package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

import java.io.IOException;
import java.util.Arrays;

public class DefaultCommand implements Command{

    @Override
    public void excute(String[] args, Session session) throws IOException {
        session.send("처리할수 없는 명령어 입니다: " + Arrays.toString(args));
    }
}
