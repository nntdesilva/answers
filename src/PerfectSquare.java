public class PerfectSquare {
    // https://leetcode.com/problems/valid-perfect-square/
    static boolean isPerfectSquare(int x) {
        if (x < 2) {
            return true;
        }
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return true;
            }
            if (mid * mid > x){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

}
