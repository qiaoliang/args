package args;

import com.google.common.collect.Maps;

import java.util.Map;

public class MySchema {

    private Map <String, MyRule> rules= Maps.newHashMap();
    private static Map<String,MyRule> meta= Maps.newHashMap();
    static{
        meta.put("bool",new BoolRule());
    }
    public MySchema(String flags) {
        String[] flaglist= flags.split(":");
        rules.put(flaglist[0],meta.get(flaglist[1]));
    }

    public MyRule getRule(String l) {
        return rules.get(l);
    }
}
