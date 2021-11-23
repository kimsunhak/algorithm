package boj.StepByStep.함수;

/**
 * 문제번호 : 4673
 */
public class 셀프넘버 {
    public static void main(String[] args) {
        int[] num = new int[100001];

        for (int i=1; i<10001; i++) {
            int n = selfNumber(i);
            num[n]++;
        }

        for (int i=1; i<10001; i++) {
            if (num[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public static int selfNumber(int n) {
        int sum = n;
        String str = String.valueOf(n);
        for (int i=0; i<str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}
