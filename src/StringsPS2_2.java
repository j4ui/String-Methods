import java.util.Locale;

public class StringsPS2_2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalondromeNoPunc("A man, a plan, a canal: Panama"));
    }

    public static Boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equals(str);
    }

    public static Boolean isPalondromeNoPunc(String str) {
        str = str.toLowerCase();
        String cleaned = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cleaned += str.charAt(i);
            }

        }
        String reversed = "";
        for (int i = cleaned.length()-1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
        return reversed.equals(cleaned);
    }

}
