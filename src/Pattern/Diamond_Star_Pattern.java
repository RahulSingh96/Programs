package Pattern;

import java.util.Scanner;

public class Diamond_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for (int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int m =1; m<=i*2-1; m++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i =n-1; i>=1; i--){
            for(int j =n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int m =i*2-1; m>=1; m--){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

//5
//        *
//       ***
//      *****
//     *******
//    *********
//     *******
//      *****
//       ***
//        *

