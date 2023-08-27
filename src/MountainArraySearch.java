public class MountainArraySearch {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        System.out.println(search(arr, 2)); // 2

    }

    private static int search(int[] arr, int target) {
        int maxIndex = peak(arr);
        int idx = binarySearch(arr, target, 0, maxIndex);
        if (idx != -1) {
            return idx;
        }
        idx = binarySearch(arr, target, maxIndex, arr.length-1);
        return idx;

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



    static int peak(int[] arr) {
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

