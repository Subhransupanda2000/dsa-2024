package com.example.array;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLinearSearch {
    @Test
    public void testlinearsearch()
    {
        int arr[]={1,2,3,4,5,6,7};
        int number=7;
        int expected=7;
        int actual=LinearSearch.linearSearch(arr,7);
        assertEquals(expected,actual);
    }
}
