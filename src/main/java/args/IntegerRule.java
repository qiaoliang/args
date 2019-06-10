package args;

public class IntegerRule implements MyRule {
    private Integer defaultvalue= new Integer(0);
    private String defaultTag;

    public IntegerRule() {
        defaultTag= "-d";
    }
    public IntegerRule(String tag) {
        this.defaultTag= tag;
    }

    @Override
    public Integer getValue(String commands) {
        if(commands==null)
            return defaultvalue;
        return Integer.valueOf(commands.trim());
    }
}
