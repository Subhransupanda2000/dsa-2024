package com.example.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static int[] removeDuplicateElement(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int index = 0;
        int[] result = new int[hs.size()];
        for (int element : hs) {
            result[index++] = element;
        }
        return result;

    }
}
