package com.example.array;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoSumProblemTest {

    @Test
    public void testTwoSum_Found() {
        int[] arr = {2, 7, 11, 15};
        int sum = 9;
        int[] expected = {2, 7};

        int[] result = TwoSumProblem.twoSum(arr, sum);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSum_NotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 20;
        int[] expected = {};

        int[] result = TwoSumProblem.twoSum(arr, sum);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSum_DuplicateElements() {
        int[] arr = {3, 3, 4, 5};
        int sum = 6;
        int[] expected = {3, 3};

        int[] result = TwoSumProblem.twoSum(arr, sum);

        assertArrayEquals(expected, result);
    }
}