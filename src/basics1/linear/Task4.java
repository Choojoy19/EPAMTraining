package basics1.linear;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number like xxx.xxx");
        double x = sc.nextDouble();
        double result = (int)x/1000.0+(x * 1000) % 1000;
        System.out.println(result);
    }
}
