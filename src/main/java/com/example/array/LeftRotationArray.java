package com.example.array;

public class LeftRotationArray {
    public static int[] leftRotationArray(int arr[]) {
        int n = arr.length - 1;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n] = temp;
        return arr;
    }
}
