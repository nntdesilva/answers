import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] answer = firstAndLastPosition.searchRange(nums, 7);
        System.out.println(Arrays.toString(answer));


    }

    public int[] searchRange(int[] nums, int target) {
        int [] idx = {-1, -1};
        idx[0] = search(nums, target, true);
        idx[1] = search(nums, target, false);
        return idx;
    }



    public int search(int[] nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < nums[middle]) {
                end = middle - 1;
            } else if(target > nums[middle]){
                start = middle + 1;
            } else{
                ans = middle;
                if(isFirst){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }

        }
        return ans;


    }







}
