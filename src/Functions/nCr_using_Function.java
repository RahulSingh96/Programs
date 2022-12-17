package Functions;

import java.util.Scanner;

public class nCr_using_Function {

    public static int factorial(int num) { // line 6 to 12 function code
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int factn = factorial(n);
        int factr = factorial(r);
        int factnr = factorial(n - r);
        int result = factn / (factr * factnr);
        System.out.println(result);
    }
}
