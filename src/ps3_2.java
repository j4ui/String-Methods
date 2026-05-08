import java.util.Scanner;

public class ps3_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(removeRepeatingLetters(scanner.nextLine()));
    }

    public static String removeRepeatingLetters(String word) {
        String result = "" + word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) != word.charAt(i)) {
                result += word.charAt(i);
            }
        }
        return result;
    }

}
