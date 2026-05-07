import java.util.Scanner;

public class StringsPS1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = replace(str, ' ', 'x');
        System.out.println(str);
    }

    public static String replace(String s, char oldChar, char newChar) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) {
                str += newChar;
            } else {
                str += s.charAt(i);
            }
        }
        return str;
    }
}
