import java.util.Scanner;

public class review1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findMiddle(10, 4, 6));
    }

    public static int findMiddle(int a, int b, int c) {
        if ((a>b && c>a) || (a>c && b>a)) {return a;}
        if ((b>a && c>b) || (b>c && a>b)) {return b;}
        if ((c>a && b>c) || (c>b && a>c)) {return c;}
        else return 0;
    }

}
