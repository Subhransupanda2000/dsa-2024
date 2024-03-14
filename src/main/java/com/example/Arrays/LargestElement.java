package com.example.Arrays;

public class LargestElement {
    public static int largestElement(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;

    }
}
