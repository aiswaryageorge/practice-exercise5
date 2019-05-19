import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

public class UpdateSpeArrayTest {
    UpdateSpeArray u;

    @Before
    public void setUp() throws Exception {
        u=new UpdateSpeArray();
    }

    @After
    public void tearDown() throws Exception {
        u=null;
    }

    @Test
    public void update(){
        u=new UpdateSpeArray();
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("berry");
        List<String> str=u.updateMethod(fruits);
        List<String> str2=new ArrayList<>();
        str2.add("green apple");
        str2.add("grape");
        str2.add("berry");
        str2.add("mango");
        assertEquals(str2,str);

    }
    @Test
    public void emptyArrayList()
    {
        u=new UpdateSpeArray();
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("kiwi");
        fruits.add("berry");
        fruits.add("10");
        String str=u.clearList(fruits);
        assertEquals("true","true");


    }
}