package CodeChef;

import java.util.Scanner;

public class Age_Limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c>=a && b>c){
                System.out.println("YES");
            }
            else if(c>b && c!=b){
                System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//5
//        21 34 30
//        25 31 31
//        22 29 25
//        20 40 15
//        28 29 28
//YES
//        NO
//    YES
//            NO
//YES