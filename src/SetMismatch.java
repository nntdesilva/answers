public class SetMismatch {
    // https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int[] errorNums = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                errorNums[0] = arr[j];
                errorNums[1] = j + 1;
            }

        }
        return errorNums;

    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
