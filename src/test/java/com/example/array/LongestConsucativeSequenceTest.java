package com.example.array;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsucativeSequenceTest {
    @Test
    public void testMixedSequence() {
        int[] arr = new int[]{100, 4, 200, 1, 3, 2};
        assertEquals(4, LongestConsucativeSequence.longestSuccessiveElements(arr));
    }
}