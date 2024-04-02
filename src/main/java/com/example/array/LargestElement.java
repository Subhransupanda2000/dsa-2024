package com.example.array;

public class LargestElement {
<<<<<<< array-impl
    public static int largestElement(int arr []) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
=======
    public static int largestElement(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
>>>>>>> main

            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;

    }
}
