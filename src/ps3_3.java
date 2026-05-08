import java.util.Scanner;

public class ps3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(removeAllDuplicates(scanner.nextLine()));
    }

    public static String removeAllDuplicates(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == word.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result += word.charAt(i);
            }
        }
        return result;
    }
}
