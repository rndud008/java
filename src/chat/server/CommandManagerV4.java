package chat.server;

import chat.server.command.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommandManagerV4 implements  CommandManager{
    private static final  String DELIMITER = "\\|";
    private final Map<String, Command> commands = new HashMap<>();
    private final Command defaultComand = new DefaultCommand();

    public CommandManagerV4(SessionManager sessionManager) {
        commands.put("/join", new JoinCommand(sessionManager));
        commands.put("/message", new MessageCommand(sessionManager));
        commands.put("/change", new ChangeCommand(sessionManager));
        commands.put("/users", new UsersCommand(sessionManager));
        commands.put("/exit", new ExitCommand(sessionManager));
    }

    @Override
    public void execute(String totalMessage, Session session) throws IOException {

        String[] args = totalMessage.split(DELIMITER);
        String key = args[0];

        Command command = commands.getOrDefault(key, defaultComand);
        command.excute(args, session);

    }
}
