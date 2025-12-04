public class CountVowels {

    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Number of vowels: " + countVowels(input));
    }
}
