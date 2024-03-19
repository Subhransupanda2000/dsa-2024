package com.example.array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static int[] unionOfTwoArray(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int[] union = new int[set.size()];

        int index = 0;
        for (int element : set) {
            union[index++] = element;
        }

        return union;
    }
}