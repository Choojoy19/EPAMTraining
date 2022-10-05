package basics1.branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();

        double z;

        if (x<=3){
            z = x*x+3*x+9;
        } else {
             z = 1/(Math.pow(x,3) + 6);
        }
        System.out.println("F(x) = "+z);

        sc.close();
    }

}
