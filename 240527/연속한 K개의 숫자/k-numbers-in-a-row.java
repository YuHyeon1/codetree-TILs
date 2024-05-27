import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        int min = k;
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i<b;i++) {
            int a = sc.nextInt();
            arr[a] = 1;
        }
        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        
        for (int i = 0; i < n-k+1; i++) {
            if (sum[k + i] - sum[i] < min) {
                min = sum[k + i] - sum[i];
            }
        }
        System.out.println(min);
    }
}