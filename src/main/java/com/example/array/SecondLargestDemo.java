package com.example.array;

//optimal:
public class SecondLargestDemo {

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 8, 9, 4, 7};
        int n = arr.length;
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];

            }
        }
        System.out.println(secondlargest);
        return;
    }

}
/*
 * BrutForce:
 * import java.util.Arrays;
 *
 * public class SecondLargest {
 * public static void main(String[] args) {
 * int[] arr = { 2, 5, 3, 8, 9, 4, 7 };
 * int n = arr.length;
 * Arrays.sort(arr);
 * Arrays.toString(arr);
 * int Secondlargest = arr[n - 2];
 * int secpndsmallest = arr[1];
 * System.out.println(secpndsmallest);
 * System.out.println(Secondlargest);
 * }
 * }
 */
/*
 * BruteForce:
 * import java.util.Arrays;
 *
 * public class SecondLargest {
 * public static void main(String[] args) {
 * int[] arr = { 2, 5, 3, 8, 9, 4, 7 };
 * int n = arr.length;
 * Arrays.sort(arr);
 * Arrays.toString(arr);
 * int largest = arr[n - 1];
 * int secondlargest = arr[n - 2];
 * for (int i = n - 2; i >= 0; i--) {
 * if ((largest != arr[i])) {
 * secondlargest = arr[i];
 * break;
 * }
 * }
 * System.out.println(secondlargest);
 * }
 * }
 */
/*
 * Better:
 * public class SecondLargest {
 *
 * public static void main(String[] args) {
 *
 * int[] arr = { 2, 5, 3, 8, 9, 4, 7 };
 * int n = arr.length;
 * int largest = arr[0];
 * for (int i = 1; i < n - 1; i++) {
 * if (largest < arr[i]) {
 * largest = arr[i];
 * }
 * }
 * int secondlargest = -1;
 * for (int j = 0; j < n; j++) {
 * if (arr[j] > secondlargest && arr[j] != largest) {
 * secondlargest = arr[j];
 * }
 * }
 * System.out.println(secondlargest);
 * }
 * }
 */
