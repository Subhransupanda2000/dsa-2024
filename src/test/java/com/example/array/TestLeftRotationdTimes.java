package com.example.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestLeftRotationdTimes {
    @Test
    public void testLeftRotationdTimes() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {4, 5, 6, 7, 1, 2, 3};
        int[] actual = LeftRotationdTimes.leftRotationdTimes(arr, 3);
        assertArrayEquals(expected, actual);
    }
}
