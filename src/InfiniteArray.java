public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 1, 15, 20};
        System.out.println(findRange(arr, 20));
    }

    private static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = end + (end - temp + 1) * 2;
        }
        return search(arr, target, start, end);


    }

    static int search(int[] arr, int target, int start, int end) {
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
