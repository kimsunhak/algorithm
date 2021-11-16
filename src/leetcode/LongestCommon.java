package leetcode;

/**
 * LeetCode 14번
 */
public class LongestCommon {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommon(strs));
    }

    public static String longestCommon(String[] strs) {
        String output = strs.length == 0 ? "" : strs[0];

        for (String str : strs) {
            // 각 문자 길이
            int shotLength = Math.min(output.length(), str.length());

            // 첫번째 문자 숫자열 길이
            output = output.substring(0, shotLength);

            for (int i=0; i<shotLength; i++) {
                // 문자 비교
                if (output.charAt(i) != str.charAt(i)) {
                    output = output.substring(0, i);
                    break;
                }
            }
        }
        return output;
    }
}
