package Pattern;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = 1;
        int B = 1;
        int sum = 0;
        for (int i = 2; i < N; i++) {
            sum = A + B;
            A = B;
            B = sum;
        }
        System.out.println(sum);
    }
}