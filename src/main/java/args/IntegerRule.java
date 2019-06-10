package args;

public class IntegerRule implements MyRule {
    private Integer defaultvalue;
    private final String defaultTag;

    public IntegerRule() {
        defaultvalue = new Integer(0);
        defaultTag= "-d";
    }
    public IntegerRule(String tag) {
        this.defaultTag= tag;
    }

    @Override
    public Integer getValue(String commands) {
        return defaultvalue;
    }
}
