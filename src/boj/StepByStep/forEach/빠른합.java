package boj.StepByStep.forEach;

import java.io.*;
import java.util.StringTokenizer;


/**
 * 문제 번호 : 15552
 */
public class 빠른합 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;

        for (int i=0; i<n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            bufferedWriter.write((Integer.parseInt(stringTokenizer.nextToken())) + Integer.parseInt(stringTokenizer.nextToken()) + "\n");
        }
        bufferedWriter.close();
    }
}
