package com.example.array;

import java.util.Arrays;
import java.util.HashMap;

public class FindSubarrayWithGivenSum {
    public static int[] findSubarrayWithGivenSum(int[] arr, int sum) {
        int currSum = 0;
        int start = 0;
        int end = -1;
        int n = arr.length;
        HashMap<Integer, Integer> sumIndices = new HashMap<>();

        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum == sum) {
                start = 0;
                end = i;
                break;
            }

            if (sumIndices.containsKey(currSum - sum)) {
                start = sumIndices.get(currSum - sum) + 1;
                end = i;
                break;
            }

            sumIndices.put(currSum, i);
        }

        if (end == -1) {
            System.out.println("Subarray with sum " + sum + " not found.");
            return new int[0]; // Return an empty array if subarray not found
        } else {
            System.out.println("Subarray with sum " + sum + " found from index " + start + " to " + end);
            // Return the subarray with given sum
            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}

