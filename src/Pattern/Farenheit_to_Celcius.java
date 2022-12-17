package Pattern;

import java.util.Scanner;

public class Farenheit_to_Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();

        while (start <= end) {
            int Celsius = ((start - 32) * 5) / 9;
            System.out.println(start + " " + Celsius);
            start = start + step;

        }

    }

}
