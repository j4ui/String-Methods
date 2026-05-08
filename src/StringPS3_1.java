import java.util.Scanner;

public class StringPS3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(toPigLatin(input));
    }

    public static String toPigLatin(String word) {
        String done = "";
        if (isVowel(word.charAt(1)) && isConsonant(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                done += word.charAt(i);
            }
            done += word.charAt(0) + "ay";
        } else if (isConsonant(word.charAt(0)) && isConsonant(word.charAt(1))) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (isConsonant(word.charAt(i)) && isConsonant(word.charAt(i + 1))) {
                    count++;
                } else break;
            }
            for (int i = count + 1; i < word.length(); i++) {
                System.out.print(word.charAt(i));
            }
            for (int i = 0; i < count + 1; i++) {
                System.out.print(word.charAt(i));
            }
            System.out.println("ay");
        } else if (isVowel(word.charAt(0))) {
            System.out.println(word + "way");
        }
        return done;
    }

    public static Boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

    public static Boolean isConsonant(char c) {
        return !isVowel(c);
    }

}
