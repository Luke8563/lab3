import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend(){
        LinkedList list = new LinkedList();
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        String s = "6 7 8 9 ";
        assertEquals(s, list.toString());

    }



}
