package Pattern;

import java.util.Scanner;

public class Odd_Number_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) { // for printing the no. of rows
            int j = n;
            int odd = 2 * i - 1;
            while (j >= i) { // for printing in increasing order
                System.out.print(odd);
                odd = odd + 2;
                j--;
            }
            int dec = 1;
            int p = 1;
            while (dec < i) { // for printing in decreasing order
                System.out.print(p);
                p = p + 2;
                dec += 1;
            }

            System.out.println();
            i++;

        }
    }
}

//4
//1357
//3571
//5713
//7135