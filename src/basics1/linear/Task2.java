package basics1.linear;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double result = (b + Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("result = "+result);
        sc.close();
    }
}
