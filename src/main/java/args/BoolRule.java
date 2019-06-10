package args;

public class BoolRule implements MyRule{

    private Boolean defaultvalue;
    private final String defaultTag;

    public BoolRule() {
        defaultvalue = Boolean.FALSE;
        defaultTag= "-l";
    }
    public BoolRule(String tag) {
        this.defaultTag= tag;
    }

    @Override
    public Object getValue(String commands) {
        return null;
    }
}
