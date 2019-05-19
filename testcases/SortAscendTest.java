import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class SortAscendTest {
    SortAscend s;

    @Before
    public void setUp() throws Exception {
        s=new SortAscend();
    }

    @After
    public void tearDown() throws Exception {
        s=null;
    }



    @Test
    public void sort(){
        s=new SortAscend();
        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("Harry");
        sortedSet.add("Olive");
        sortedSet.add("Alice");
        sortedSet.add("Bluto");
        sortedSet.add("Eugene");
        ArrayList<String> result=s.listSorting(sortedSet);
        System.out.println(result);
        ArrayList<String> res1=new ArrayList<>();
        sortedSet.add("Alice");
        sortedSet.add("Bluto");
        sortedSet.add("Eugene");
        sortedSet.add("Harry");
        sortedSet.add("Olive");
        assertEquals(res1,result);
      assertEquals("",result);

    }
}



