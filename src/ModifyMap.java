import java.util.Map;

public class ModifyMap {

    public Map<String, String> displayKeyValue(Map<String, String> map) {
        String value = map.get("value1");
        map.replace("value2", value);
        map.replace("value1", " ");
        return map;

    }
}