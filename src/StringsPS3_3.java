import java.util.Scanner;

public class StringsPS3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println(removeAllDuplicates(word));
    }

    public static String removeAllDuplicates(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    count++;
                }
            }
            if (count == 1) {
                result += c;
            }
        }
        return result;
    }

}
