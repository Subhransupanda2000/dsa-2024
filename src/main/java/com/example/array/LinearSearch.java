package com.example.array;

public class LinearSearch {
    public static int linearSearch(int arr [],int number)
    {
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]==number)
            {
                return arr[i];
            }
        }
        return -1;
    }

}
