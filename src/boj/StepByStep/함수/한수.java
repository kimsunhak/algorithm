package boj.StepByStep.함수;

import java.util.Scanner;


/**
 * 문제번호 : 1065
 */
public class 한수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number < 100) {
            System.out.println(number);
        } else {
            int count = 99;
            for (int i=100; i<=number; i++) {
                if (hanSu(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean hanSu(int number) {
        int numberOne = number/100 - (number%100 / 10);
        int numberTwo = (number%100/10) - number%10;
        return numberOne == numberTwo;
    }
}
