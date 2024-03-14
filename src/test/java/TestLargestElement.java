import Arrays.LargestElement;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLargestElement {
    @Test
    public void testLargestElement() {
        int[] arr = {1, 7, 5, 6, 9};
        int expected = 9;
        int actual = LargestElement.largestElement(arr);
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWithNullArray() {
        int[] arr = {};
        LargestElement.largestElement(arr);
    }

    @Test
    public void testWithEqualElements() {
        int arr[] = {2, 2, 2, 2, 2};
        int actual = LargestElement.largestElement(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
