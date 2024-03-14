package com.example.array;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TestSecondLargestElement {
    @Test
    public void testSecondLargest() {
        int arr[] = {1, 6, 3, 9};
        int expected = 6;
        int actual = SecondLargestElement.secondLargest(arr);
        assertEquals(expected, actual);
    }
}
