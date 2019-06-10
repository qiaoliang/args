package args;

import com.google.common.collect.Maps;

import java.util.Map;

public class MySchema {

    private Map <String, MyRule> rules= Maps.newHashMap();
    private static Map<String,MyRule> meta= Maps.newHashMap();
    static{
        meta.put("bool",new BoolRule());
        meta.put("int",new IntegerRule());
    }
    public MySchema(String flags) {
        String[] totalFlags= flags.split(",");
        for (String eachflag :
                totalFlags) {
            parseFlag(eachflag);
        }

    }

    private void parseFlag(String eachflag) {
        String[] flaglist= eachflag.split(":");
        rules.put(flaglist[0],meta.get(flaglist[1]));

    }

    public MyRule getRule(String l) {
        return rules.get(l);
    }
}
