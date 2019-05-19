import java.util.List;


public class UpdateSpeArray {
    public List<String> updateMethod(List<String> list){
        list.set(0,"green apple");
        list.set(3,"mango");
        return list;
    }
    public String clearList(List<String> list){
        list.clear();
        String result="";
        if(list.isEmpty())
        {
            result="true";
        }
        else
            result="false";
        return result;

    }
}

