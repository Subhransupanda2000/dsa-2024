package com.example.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsucativeSequence {

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        int longest = 1;

        // Use a set to efficiently check if an element exists
        Set<Integer> numSet = new HashSet<>(n);
        for (int num : a) {
            numSet.add(num);
        }

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;

            // Check if current element is the starting point of a sequence
            if (!numSet.contains(x - 1)) {
                while (numSet.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}