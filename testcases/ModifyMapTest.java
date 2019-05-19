import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapTest {
    ModifyMap m;

    @Before
    public void setUp() throws Exception {
        m=new ModifyMap();
    }

    @After
    public void tearDown() throws Exception {
        m=null;
    }

    @Test
    public void map(){
        m=new ModifyMap();
        Map<String,String> map=new HashMap<String,String>();
        map.put("value1","mars");
        map.put("value2","saturn");
        Map<String,String> resultmap=m.displayKeyValue(map);
        Map<String,String> mapresult=new HashMap<String,String>();
        mapresult.put("value1"," ");
        mapresult.put("value2","mars");
        assertEquals(mapresult,resultmap);

    }
}

