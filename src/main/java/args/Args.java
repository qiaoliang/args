package args;

import java.util.Arrays;
import java.util.List;

public class Args {

    private final MySchema mySchema;
    private final List commands;

    public Args(String flags, String command) {
        mySchema = new MySchema(flags);
        if(command==null)
            command="";
        commands = Arrays.asList(command.split(" "));
    }
    public Object getValue(String flag) {
        MyRule rule = mySchema.getRule(flag);
        int index=commands.indexOf("-"+flag);
        if(index<0)
            return rule.getValue(null);
        return rule.getValue(index+1<commands.size()? (String) commands.get(index+1) :null);
    }
}
