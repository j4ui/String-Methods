import java.util.Scanner;

public class roman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        numeralToNumber(input);
    }

    public static int value(char c) {
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

    public static void numeralToNumber(String s) {
        int total = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (value(s.charAt(i)) < value(s.charAt(i + 1))) {
                total -= value(s.charAt(i));
            } else {total += value(s.charAt(i));}
        }
        total += value(s.charAt(s.length()-1));
        System.out.println(s + " = " + total);
    }
}
