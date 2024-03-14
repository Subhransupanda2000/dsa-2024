import Arrays.LargestElement;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLargestElement {
    @Test
    public void testLargestElement()
    {
        int arr []={5,3,6,1,7,9};
        int expected=9;
        int actual=LargestElement.largestElement(arr);
        assertEquals(expected,actual);
    }
}
