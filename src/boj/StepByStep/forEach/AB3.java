package boj.StepByStep.forEach;

import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();


        for (int i = 0; i < length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
