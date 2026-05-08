import java.util.Scanner;

public class review2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(containsString("abc", "abc"));
    }

    public static boolean containsString(String s, String word) {
        for (int i = 0; i <= s.length() - word.length(); i++) {
            if (s.substring(i, i + word.length()).equals(word)) {
                return true;
            }
        }
        return false;
    }

}
