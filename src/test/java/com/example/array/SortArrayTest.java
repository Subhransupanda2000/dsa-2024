package com.example.array;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class SortArrayTest {
    @Test
    public void testMixedArray() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        int n=6;
        ArrayList<Integer> actual=SortArray.sortArray(arr,n);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 2, 2));
        assertEquals(expected, actual);
    }

}
