import java.util.HashMap;
import java.util.Map;


public class NoofCounts {

    public  Map<String, Integer> findNumberOfCount(String str)
    {


       String[] list= str.split("[\\W_]+");
        HashMap<String,Integer> stringCount=new HashMap<>();

        for (String s: list)
        {
            if(stringCount.containsKey(s))
            {
                stringCount.replace(s,stringCount.get(s)+1);
            }
            else
            {
                stringCount.put(s,1);
            }

        }
        return stringCount;

    }

}
