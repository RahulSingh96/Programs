package Pattern;

import java.util.Scanner;

public class Num_Pattern {
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
            int k = 1;
            while (k <= i) {
                System.out.print(k);
                k = k + 1;
            }
            int l = 2;
            while (l <= i) {
                System.out.print(l);
                l = l + 1;
            }
            System.out.println();
            i = i + 1;
        }

    }
}