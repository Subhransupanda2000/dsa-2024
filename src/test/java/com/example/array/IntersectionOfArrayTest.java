package com.example.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfArrayTest {

    @Test
    public void testIntersectionOfTwoArray() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] expectedIntersection = {4, 5};

        int[] result = IntersectionOfArray.intersectionOfTwoArray(arr1, arr2);

        assertArrayEquals(expectedIntersection, result);
    }

    @Test
    public void testIntersectionOfTwoArray_NoIntersection() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expectedIntersection = {};

        int[] result = IntersectionOfArray.intersectionOfTwoArray(arr1, arr2);

        assertArrayEquals(expectedIntersection, result);
    }

    @Test
    public void testIntersectionOfTwoArray_EmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expectedIntersection = {};

    }
}