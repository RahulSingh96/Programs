package Pattern;

import java.util.Scanner;

class max {
    static int maxnumber(int n, int k) {
        for (int j = 0; j < k; j++) {
            int ans = 0;
            int i = 1;
            while (n / i > 0) {
                int temp = (n / (i * 10)) * i + (n % i);
                i *= 10;
                ans = Math.max(ans, temp);
            }
            n = ans;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        System.out.println(maxnumber(n, k));
    }
}
