package String;

import java.util.Scanner;

public class Palindrome_String {
    public static boolean reverseString(String str) {
        String str1 = "";
        boolean str2 = true;
        for (int i = str.length()-1 ; i >= 0; i--) {
            str1 = str1+str.charAt(i);
        }

        boolean com = str.equals(str1);
        return com;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean reversedString = reverseString(str);
        System.out.println(reversedString);

    }

}
