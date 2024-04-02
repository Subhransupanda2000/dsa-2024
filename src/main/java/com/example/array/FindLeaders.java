package com.example.array;
import java.util.*;
class FindLeaders {
    public static ArrayList<Integer> printLeaders(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            if (leader)
                ans.add(arr[i]);
        }
        return ans;
    }
}
