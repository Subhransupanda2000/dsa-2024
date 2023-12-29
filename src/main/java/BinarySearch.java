public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;
        System.out.println(binarySearch(key, array));
    }

    public static int binarySearch(int key, int array[]) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;


            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }
        return -1;

    }
}
