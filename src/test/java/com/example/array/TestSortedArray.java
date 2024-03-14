package com.example.array;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestSortedArray {
    @Test
    public void sortedArray() {
        int[] arr = {1, 2, 3, 4};
        boolean expected = true;
        boolean actual = SortedArray.sortedArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void nonSortedArray() {
        int[] arr = {1, 2, 3, 4, 3};
        boolean expected = false;
        boolean actual = SortedArray.sortedArray(arr);
        assertEquals(expected, actual);
    }
}
