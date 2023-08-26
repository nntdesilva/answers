public class PeakIndex {
    //https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 0};
        System.out.println(search(arr));

    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }


}

