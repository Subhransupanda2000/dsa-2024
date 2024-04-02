package com.example.array;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    @Test
    public void testMajorityElementArray() {
        // Test case 1: Majority element exists
        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        assertEquals(4, MajorityElement.majorityElementArray(arr1));

    }
}
