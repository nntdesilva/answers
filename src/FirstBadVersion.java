/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion {
    // https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        return search(1, n);
    }

    public boolean isBadVersion(int version){
        int bad = 4;
        return version == bad;
    }


    public int search(int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (isBadVersion(middle) && !isBadVersion(middle-1)) {
                return middle;
            }
            if (!isBadVersion(middle)) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}