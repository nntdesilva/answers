public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = {'x', 'x', 'y', 'y'};     //ascending order
        SmallestLetter smallestLetter = new SmallestLetter();
        char c = smallestLetter.nextGreatestLetter(letters, 'z');
        System.out.println(c);

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target >= letters[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (start < letters.length) {
            return letters[start];
        }
        return letters[0];

    }
}
