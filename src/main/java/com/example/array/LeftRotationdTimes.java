package com.example.array;

public class LeftRotationdTimes {
    public static int[] leftRotationdTimes(int[] arr, int d) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        // Perform left rotation by d positions
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + n - d) % n] = arr[i];
        }

        return rotatedArray;
    }
}
