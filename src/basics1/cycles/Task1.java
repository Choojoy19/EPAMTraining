package basics1.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input +number");
        int x = sc.nextInt();

        int sum=0;

        for (int i=1;i<x;i++){
            sum +=i;
        }
        System.out.println("sum = "+sum);

        sc.close();
    }
}
