package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {9, 5, 7, 3, 9, 4};
        int largest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println(largest);

    }
}
