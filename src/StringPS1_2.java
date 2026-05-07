import java.util.Scanner;

public class StringPS1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(averageLength(str));
    }

    public static double averageLength(String s) {
        int total = 0, count = 0, words = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                words++;
                total += count;
                count = 0;
            }
        } return (double) total / words;
    }
}
