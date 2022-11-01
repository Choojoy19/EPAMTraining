package basics1.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input interval from m (>0) to n");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i=m; i<n; i++){
            for (int j=2; j<(i-1);j++){
                if (i%j==0){
                    System.out.println("for number - "+i+" denominator - "+j);
                }
            }
        }
    }
}
