import java.util.Scanner;

public class StringPS3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(removeRepeatingLetters(scanner.nextLine()));
    }

    public static String removeRepeatingLetters(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (result.length() == 0 || c != result.charAt(result.length() - 1)) {
                result += c;
            }
        }
        return result;
    }

}
