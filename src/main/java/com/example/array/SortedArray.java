package com.example.array;

public class SortedArray {
    public static boolean sortedArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }
}
