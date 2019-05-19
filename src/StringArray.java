import java.util.HashMap;
import java.util.Map;
public class StringArray {

    public  Map<String,Boolean> mapString(String[] str)
    {
        Map<String, Boolean> stringmap = new HashMap<>();
        for (String word : str) {
            if (stringmap.containsKey(word)) {
                stringmap.replace(word, true);
            } else {
                stringmap.put(word, false);
            }
        }
        return stringmap;

    }
}


