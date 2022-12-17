package Pattern;

import java.util.Scanner;

public class Decrement_number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for (i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

//5
//        55555
//        4444
//        333
//        22
//        1
