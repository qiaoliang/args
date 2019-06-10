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
    public Boolean getValue(String commands) {
        if(commands==null)
            return defaultvalue;
        return Boolean.TRUE;
    }
}
