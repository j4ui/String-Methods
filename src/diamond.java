import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diamond(scanner.nextLine());

    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void diamond(String str) {
        if(str.length() > 10) {str = str.substring(0, 10);}
        for (int i = str.length() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {System.out.print(" ");}
            System.out.print(str.substring(0, -i + str.length()));
            System.out.print(reverse(str.substring(0, -i + str.length() - 1)));
            System.out.println();
        }
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = -1; j < i; j++) {System.out.print(" ");}
            System.out.print(str.substring(0, -i + str.length()-1));
            System.out.print(reverse(str.substring(0, -i + str.length() - 2)));
            System.out.println();
        }
    }
}