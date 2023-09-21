public class Sqrtx {
    // https://leetcode.com/problems/sqrtx/

    static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int)mid;
            }
            if (mid * mid > x){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)end;
    }
}
