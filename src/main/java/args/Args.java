package args;

public class Args {

    private final MySchema mySchema;

    public Args(String flags, String command) {
        mySchema = new MySchema(flags);
    }

    public Object getValue(String flag) {
        return Boolean.FALSE;
    }
}
