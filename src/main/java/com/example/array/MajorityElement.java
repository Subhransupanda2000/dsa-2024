package com.example.array;

import java.util.*;

public class MajorityElement {

    public static int majorityElementArray(int[] arr) {
        int n = arr.length;

        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        for (int num : uniqueElements) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return num;
            }
        }

        return -1;

    }
}