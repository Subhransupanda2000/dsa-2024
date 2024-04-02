package com.example.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestLeftRotationArray {
    @Test
    public void testLeftRotationArray()
    {
        int arr[]={1,2,5,4,8,7};
        int[] expected={2,5,4,8,7,1};
        int[] actual=LeftRotationArray.leftRotationArray(arr);
        assertArrayEquals(expected, actual);

    }
}
