package hacker.최소거리;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        int[] n = new int[a.size()];
        int minDistance = Integer.MAX_VALUE;
        int index = 0;
        int current = 0;

        for (int i=0; i<a.size(); i++) {
            n[i] = (int)a.get(i);
        }

        Map<Integer, Integer> param = new HashMap<>();

        for (int i=0; i<n.length; i++) {
            if (param.containsKey(n[i])) {
                current = i;
                index = param.get(n[i]);
                minDistance = Math.min((current - index), minDistance);
            }
            param.put(n[i], i);
        }

        return (minDistance == Integer.MAX_VALUE ? -1 : minDistance);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
