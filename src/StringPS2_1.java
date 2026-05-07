import java.util.Scanner;

public class StringPS2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;
        int middleIndex;
        String str = scanner.nextLine();
        String text;


        if (str.length()>10 ) {width = 19; str = str.substring(0, 9);} else {width = str.length(); text = str;}
        middleIndex = str.length()-1;
        for (int i = 0; i < middleIndex; i++) {
            for (int j = 1; j < width; j++) {

            }
        }
    }
}
