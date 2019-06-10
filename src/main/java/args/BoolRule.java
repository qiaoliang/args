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
        if(commands!=null&&commands.trim().equalsIgnoreCase("true"))
            return Boolean.TRUE;
        return defaultvalue;
    }
}
