public class Coins {
    // https://leetcode.com/problems/arranging-coins/
    static int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long answer = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long k = mid * (mid + 1) / 2;
            if (k <= n) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) answer;

    }
}
