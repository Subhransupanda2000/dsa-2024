package com.example.array;

public class NonzeroElementAtFirstOfArray {
    public static int[] nonzeroElementAtFirstOfArray(int[] arr) {
        int n = arr.length;
        int j = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
