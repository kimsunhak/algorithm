package boj.StepByStep.Arrangement;


import java.util.Scanner;

/**
 * 문제 번호 : 8958
 */
public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ox = new String[n];

        for (int i=0; i<n; i++) {
            ox[i] = sc.next();
        }

        for (String oxResult : ox) {
            int count = 0;
            int total = 0;
            for (int i=0; i<oxResult.length(); i++) {
                if (oxResult.charAt(i) == 'O') {
                    total += ++count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }
    }
}
