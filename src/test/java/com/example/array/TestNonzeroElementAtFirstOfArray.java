package com.example.array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestNonzeroElementAtFirstOfArray {
    @Test
    public void testNonzeroElementAtFirstOfArray() {
        int[] arr = {1, 0, 2, 3, 4, 0, 5, 0, 9};
        int[] expected = {1,2,3,4,5,9,0,0,0};
        int[] actual = NonzeroElementAtFirstOfArray.nonzeroElementAtFirstOfArray(arr);
        assertArrayEquals(expected, actual);
    }
}
