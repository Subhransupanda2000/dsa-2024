package com.example.array;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    //Brutforce
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 6, 8, 6, 8, };
        Set<Integer> set = new HashSet();

        for (int i = 0; i < arr.length - 1; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

    }
}

