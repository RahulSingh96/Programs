package Pattern;

import java.util.Scanner;

public class Alphabet_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;
        int i = 1;
        for (i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) (a + n + i - j - 1));
            }
            System.out.println();
        }

    }
}

//5
//        E
//        DE
//        CDE
//        BCDE
//        ABCDE

