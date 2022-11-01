package basics1.cycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        digitsOfNumber(a);
        System.out.println();
        digitsOfNumber(b);

    }

    public static void digitsOfNumber (int number){
        String x = Integer.toString(number);
        for (int i = 0; i<x.length(); i++){
            System.out.println(x.charAt(i));
        }
    }
}
