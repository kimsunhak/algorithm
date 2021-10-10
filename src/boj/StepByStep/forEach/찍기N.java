package boj.StepByStep.forEach;

import java.util.Scanner;

public class 찍기N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i=n; i>0; --i) {
            System.out.println(i);
        }
    }
}
