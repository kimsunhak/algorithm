package boj.StepByStep.forEach;

import java.util.Scanner;

public class N찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
