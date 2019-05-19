import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


import static org.junit.Assert.*;

public class StringArrayTest {
    StringArray sa;

    @Before
    public void setUp() throws Exception {
        sa=new StringArray();
    }

    @After
    public void tearDown() throws Exception {
        sa=null;
    }
    @Test
    public void arraytest(){
        sa=new StringArray();
        String[] arr={"a","b","a","a","c","c","d"};
        Map<String,Boolean> res=sa.mapString(arr);
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        result.put("a",true);
        result.put("b",false);
        result.put("c",true);
        result.put("d",false);
        assertEquals(result,res);
    }

    @Test
    public void GivenStringArray() {
        sa=new StringArray();
        String[] str = {"one", "two", "three", "one", "two"};
        Map<String,Boolean> res= sa.mapString(str);
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        result.put("one",true);
        result.put("two",true);
        result.put("three",false);
        assertEquals(result,res);
    }

}
