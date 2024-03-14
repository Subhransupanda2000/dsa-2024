package com.example.array;

public class SecondLargestElement {
    public static int secondLargest(int [] arr)
    {
        int largest=arr[0];
        int secondLargest=-1;
        for (int i=1;i< arr.length;i++)
        {
            if (largest<arr[i])
            {
                largest=arr[i];
            }
        }
        for (int j=1;j< arr.length;j++) {

            if (arr[j] != largest && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;

    }
}
