package com.example.array;

public class TwoSumProblem {
    public static int[] twoSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }
}