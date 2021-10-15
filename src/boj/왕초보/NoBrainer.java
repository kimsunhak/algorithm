package boj.왕초보;

import java.util.Scanner;

/**
 * 문제 번호: 4562
 */
public class NoBrainer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y || x == y) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }
    }
}
