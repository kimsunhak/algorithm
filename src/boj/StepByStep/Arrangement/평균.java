package boj.StepByStep.Arrangement;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 번호 : 1546
 */
public class 평균 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] array = new double[sc.nextInt()];
        double sum = 0;

        for (int i=0; i< array.length; i++) {
            array[i] = sc.nextDouble();
        }

        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            sum += (array[i] / array[array.length -1]) * 100;
        }

        System.out.print(sum / array.length);
    }
}
