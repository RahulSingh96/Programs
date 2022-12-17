package Pattern;

import java.util.Scanner;

public class Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j = j + 1;
            }
            int p = 1;
            while (p <= i) {
                System.out.print("*");
                p = p + 1;
            }
            int a = 1;
            while (a <= i - 1) {
                System.out.print("*");
                a = a + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

//5
//        *
//       ***
//      *****
//     *******
//    *********