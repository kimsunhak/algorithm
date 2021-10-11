package boj.StepByStep.forEach;


import java.util.Scanner;

/**
 * 문제 번호 : 11021
 */
public class AB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println("Case #" + i + ":" + (sc.nextInt() + sc.nextInt()));
        }

        sc.close();
    }
}
