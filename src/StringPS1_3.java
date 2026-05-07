import java.util.Scanner;

public class StringPS1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordA = scanner.nextLine();
        String wordB = scanner.nextLine();
        System.out.println(isHeteroPair(wordA, wordB));
    }

    public static Boolean isHeteroPair(String wordA, String wordB) {
        for (int i = 0; i < wordA.length(); i++) {
            for (int j = 0; j < wordB.length(); j++) {
                if (wordA.charAt(i) == wordB.charAt(j)) {return false;}
            }
        } return true;
    }

}
