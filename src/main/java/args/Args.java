package args;

import java.util.Arrays;
import java.util.List;

public class Args {

    private final MySchema mySchema;
    private final List commands;

    public Args(String flags, String command) {
        mySchema = new MySchema(flags);
        commands = Arrays.asList(command.split(" "));
    }

    public Object getValue(String flag) {
        return Boolean.FALSE;
    }
}
