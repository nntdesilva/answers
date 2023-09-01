public class GuessNumber {
    // https://leetcode.com/problems/guess-number-higher-or-lower/
    public static void main(String[] args) {
        GuessNumber solution = new GuessNumber();
        System.out.println(solution.guessNumber(10));
    }

    public int guess(int myGuess) {
        int pick = 10;
        if (myGuess == pick) {
            return 0;
        }
        if (myGuess > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    public int guessNumber(int n) {
       return search(1, n);
    }


    public int search(int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (guess(middle) == 0) {
                return middle;
            }
            if (guess(middle) < 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}