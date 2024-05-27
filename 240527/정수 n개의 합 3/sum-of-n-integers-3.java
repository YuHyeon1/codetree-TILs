import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int box = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n+1; i++) {
            sum[i][0] = 0;
        }
        for (int i=0; i<n+1; i++) {
            sum[0][i] = 0;
        }
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1]+arr[i][j]-sum[i-1][j-1];
            }
        }
        if (box == 1) {
            int max = 0;
            for (int i=1; i<n+1; i++) {
                for (int j=1; j<n+1; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println(max);
        }
        else {
            int max = 0;
            for (int i=box; i<n+1; i++) {
                for (int j=box; j<n+1; j++) {
                    if (sum[i][j] - sum[i-box][j]-sum[i][j-box]+sum[i-box][j-box] > max) {
                        max = sum[i][j] - sum[i-box][j]-sum[i][j-box]+sum[i-box][j-box];
                    }
                }
            }
            System.out.println(max);
        }
    }
}