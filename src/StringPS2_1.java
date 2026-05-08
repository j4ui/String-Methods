import java.util.Scanner;

public class StringPS2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() > 10) {
            str = str.substring(0, 10);
        }
        printDiamond(str);
    }

    public static void printDiamond(String str) {
        int n = str.length();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
