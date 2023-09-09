import java.util.Arrays;

public class MissingNumber {
    // https://leetcode.com/problems/missing-number/

    static int missingNumber(int[] arr) {
        int i = 0;
        int len = arr.length;
        while (i < len) {
            if (i != arr[i] && arr[i] < len) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if (arr[j] != j) {
                len = j;
            }

        }
        return len;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
