package Pattern;

import java.util.Scanner;

public class P12 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int n1 = (n + 1) / 2;
        int n2 = n / 2;
        while (i <= n1) {
            int space = 1;
            while (space <= n1 - i) {
                System.out.print(" ");
                space = space + 1;
            }
            int stars = 1;
            while (stars <= i) {
                System.out.print('*');
                stars = stars + 1;
            }
            int stars1 = 1;
            while (stars1 <= i - 1) {
                System.out.print('*');
                stars1 = stars1 + 1;
            }
            System.out.println();
            i = i + 1;
        }
        int j = 1;
        while (j <= n2) {
            int spaces1 = 1;
            while (spaces1 <= j) {
                System.out.print(' ');
                spaces1++;

            }
            int stars3 = 1;
            while (stars3 <= n2 - j + 1) {
                System.out.print('*');
                stars3 = stars3 + 1;
            }
            int stars4 = 1;
            while (stars4 <= n2 - j) {
                System.out.print('*');
                stars4 = stars4 + 1;
            }
            System.out.println();
            j = j + 1;
        }
    }
}
//5
//        *
//       ***
//      *****
//       ***
//        *