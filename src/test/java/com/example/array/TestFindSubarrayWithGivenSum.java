package com.example.array;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestFindSubarrayWithGivenSum {

    @Test
    public void testFindSubarrayWithGivenSum() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        int[] expectedSubarray = {20, 3, 10};

        int[] result = FindSubarrayWithGivenSum.findSubarrayWithGivenSum(arr, sum);

        assertArrayEquals(expectedSubarray, result);
    }

    @Test
    public void testFindSubarrayWithGivenSum_NotFound() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 99;
        int[] expectedSubarray = {};

        int[] result = FindSubarrayWithGivenSum.findSubarrayWithGivenSum(arr, sum);

        assertArrayEquals(expectedSubarray, result);
    }
}