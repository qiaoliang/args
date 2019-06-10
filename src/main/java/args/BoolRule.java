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
        if(commands.trim().equalsIgnoreCase(defaultTag))
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
