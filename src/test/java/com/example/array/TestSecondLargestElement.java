package com.example.array;

import static junit.framework.TestCase.assertEquals;

import junit.framework.AssertionFailedError;
import org.junit.Test;

public class TestSecondLargestElement {
    @Test
    public void testSecondLargest() {
        int arr[] = {1, 6, 3, 9};
        int expected = 6;
        int actual = SecondLargestElement.secondLargest(arr);
        assertEquals(expected, actual);
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWithNullArray() {
        int[] arr = {};
        SecondLargestElement.secondLargest(arr);
    }

    @Test(expected = AssertionFailedError.class)
    public void testWithEqualElements() {
        int arr[] = {2, 2, 2, 2, 2};
        int actual = SecondLargestElement.secondLargest(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
