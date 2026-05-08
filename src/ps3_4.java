import java.util.Scanner;

public class ps3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(removeExtraDuplicates(scanner.nextLine()));
    }

    public static String removeExtraDuplicates(String word) {
        String result = "" + word.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }

}
