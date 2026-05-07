import java.util.Scanner;

public class StringPS2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine().toUpperCase();
        System.out.println(roman + " = " + romanToInt(roman));
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String str) {
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            int value = romanValue(str.charAt(i));
            if (i < str.length() - 1 && value < romanValue(str.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
    }
}
