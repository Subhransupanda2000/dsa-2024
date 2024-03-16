package com.example.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestRemoveDuplicateElement {
    @Test
    public void testDuplicateElement() {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int[] actual = RemoveDuplicateElement.removeDuplicateElement(arr);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, actual);

    }
}
