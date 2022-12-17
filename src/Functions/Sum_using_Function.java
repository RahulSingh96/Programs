package Functions;

import java.util.Scanner;

public class Sum_using_Function {

    public static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = sum(num1, num2);
        System.out.println(ans);
    }
}
