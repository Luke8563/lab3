import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void averageWithoutLowest(){
    double[] input1 = {1,2,3,4,5,6,7};
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input1),0.0);
  }

  @Test
  public void averageWithoutLowest2(){
    double[] input1 = {15.0,20,25,60,40};
    assertEquals(36.25, ArrayExamples.averageWithoutLowest(input1),0.0);
  }


}
