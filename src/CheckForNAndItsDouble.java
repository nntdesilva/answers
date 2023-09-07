public class CheckForNAndItsDouble {
    // https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));

    }


    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean answer = search(arr, arr[i] * 2, i);
            if (answer) {
                return true;
            }

        }
        return false;

    }


    static boolean search(int[] arr, int target, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && i != idx) {
                return true;
            }

        }
        return false;
    }


}
