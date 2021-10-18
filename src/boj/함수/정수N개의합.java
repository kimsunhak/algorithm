package boj.함수;


/**
 * 문제 번호: 15596
 */
public class 정수N개의합 {
    long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
}
