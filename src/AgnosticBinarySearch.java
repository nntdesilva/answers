public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {50, 45, 32, 22, 20, 16, 5, 1};
//        int[] arr = {2, 6, 8, 12, 15, 20};
//        int[] arr = {3,3,3,3,3,3};
        System.out.println(agnosticBinarySearch(arr, 12));
    }

    static int agnosticBinarySearch(int[] arr, int target){
        int firstEl = arr[0];
        int lastEl = arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] == target && firstEl == lastEl){
                return mid;
            }
            else if(firstEl>lastEl){
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
