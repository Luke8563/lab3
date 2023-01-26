import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;



public class ListTests {
    @Test
    public void testFilter(){
        List<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("bye");
        StringChecker sc = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                // TODO Auto-generated method stub
                return true;
            }
        };
        assertEquals(list,ListExamples.filter(list, sc));
    }
    



}
