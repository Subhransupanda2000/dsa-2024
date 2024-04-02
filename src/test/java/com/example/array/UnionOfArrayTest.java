package com.example.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UnionOfArrayTest {

    @Test
    public void testUnionOfTwoArray() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] expectedUnion = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = UnionOfArray.unionOfTwoArray(arr1, arr2);

        assertArrayEquals(expectedUnion, result);
    }

    @Test
    public void testUnionOfTwoArray_EmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expectedUnion = {};

        int[] result = UnionOfArray.unionOfTwoArray(arr1, arr2);

        assertArrayEquals(expectedUnion, result);
    }

    @Test
    public void testUnionOfTwoArray_OneEmptyArray() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expectedUnion = {1, 2, 3};

        int[] result = UnionOfArray.unionOfTwoArray(arr1, arr2);

        assertArrayEquals(expectedUnion, result);
    }
}