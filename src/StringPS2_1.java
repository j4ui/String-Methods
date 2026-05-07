import java.util.Scanner;

public class StringPS2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;
        String str = scanner.nextLine();

        if (str.length()>10 ) {
            width = 19;
        } else {
            width = str.length();

        }
    }
}
