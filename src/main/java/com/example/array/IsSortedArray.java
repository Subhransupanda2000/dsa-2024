package com.example.array;
public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, };
        boolean result = isSortedOrNot(arr);
        System.out.println(result);

    }

    public static boolean isSortedOrNot(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
