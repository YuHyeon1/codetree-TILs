import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arra = new int[n + 1][m + 1];
        int[][] arrb = new int[n + 1][m + 1];
        int[][] arrc = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                char ch = line.charAt(j - 1);
                if (ch == 'a') arra[i][j] = 1;
                else if (ch == 'b') arrb[i][j] = 1;
                else if (ch == 'c') arrc[i][j] = 1;
            }
        }

        int[][] suma = calculatePrefixSum(arra, n, m);
        int[][] sumb = calculatePrefixSum(arrb, n, m);
        int[][] sumc = calculatePrefixSum(arrc, n, m);

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < k; q++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int resultA = getSubMatrixSum(suma, a, b, c, d);
            int resultB = getSubMatrixSum(sumb, a, b, c, d);
            int resultC = getSubMatrixSum(sumc, a, b, c, d);

            sb.append(resultA).append(" ").append(resultB).append(" ").append(resultC).append("\n");
        }

        System.out.print(sb);
    }

    static int[][] calculatePrefixSum(int[][] arr, int n, int m) {
        int[][] prefixSum = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }
        return prefixSum;
    }

    static int getSubMatrixSum(int[][] prefixSum, int a, int b, int c, int d) {
        return prefixSum[c][d] - prefixSum[a][d] - prefixSum[c][b] + prefixSum[a][b];
    }
}