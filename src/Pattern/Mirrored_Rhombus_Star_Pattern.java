package Pattern;

import java.util.Scanner;

public class Mirrored_Rhombus_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i - 1) {
                System.out.print(" ");
                j = j + 1;
            }
            int p = 1;
            while (p <= n) {
                System.out.print("*");
                p = p + 1;
            }

            System.out.println();
            i = i + 1;

        }
    }
}

//5
//*****
// *****
//  *****
//   *****
//    *****