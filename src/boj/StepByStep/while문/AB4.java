package boj.StepByStep.while문;

import java.util.Scanner;

/**
 * 문제 번호: 10951
 */
public class AB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt() + sc.nextInt());
        }
    }
}
