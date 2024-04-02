package com.example.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static int[] intersectionOfTwoArray(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectSet = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }

        int[] intersection = new int[intersectSet.size()];

        int index = 0;
        for (int num : intersectSet) {
            intersection[index++] = num;
        }

        return intersection;
    }
}

