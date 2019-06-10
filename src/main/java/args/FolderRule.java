package args;

public class FolderRule implements MyRule {
    private String defaultvalue= ".";
    private String defaultTag;

    public FolderRule() {
        defaultTag= "-f";
    }
    public FolderRule(String tag) {
        this.defaultTag= tag;
    }

    @Override
    public String getValue(String commands) {
        if(commands!=null&&!commands.trim().isEmpty())
            return commands.trim();
        return defaultvalue;
    }
}
