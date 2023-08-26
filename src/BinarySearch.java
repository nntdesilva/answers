public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 1, 15, 20};
        System.out.println(binarySearch(arr, 8));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
