package Pattern;

import java.util.Scanner;

public class Right_angle_increment_number {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i =1;
            while(i<=n){
                int j =1;
                while(j<=i){
                    System.out.print(i-j+1);
                    j = j + 1;
                }
                System.out.println();
                i = i + 1;
            }

        }
    }

//5
//        1
//        21
//        321
//        4321
//        54321

