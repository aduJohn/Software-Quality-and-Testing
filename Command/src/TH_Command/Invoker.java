package TH_Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands;

    public Invoker() {
        this.commands = new ArrayList<>();
    }
    public void takeCommand(Command command){
        commands.add(command);
    }
    public void executeCommand(){
        if(commands.size()>0){
            commands.get(0).execute();
            commands.remove(0);
        }
    }
    public void executeAllCommands(){
        for (Command command:commands) {
            command.execute();
        }
        commands.clear();
    }
}
