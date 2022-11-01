package basics1.cycles;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input E");
        double e = sc.nextDouble();
        System.out.println("input n");
        int n = sc.nextInt();

        double sum = 0;
        double a = 0;
        for (int i=1; i<n; i++){
            a = 1/(Math.pow(2,i))+1/(Math.pow(3,i));
            if (Math.abs(a)>=e){
                sum+=a;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
