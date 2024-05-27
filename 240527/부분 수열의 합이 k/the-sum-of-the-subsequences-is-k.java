import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        sum[0] = 0;
        for (int i = 1; i < n+1; i++) {
            sum[i] = arr[i] + sum[i-1];
        }
        if (sum[1]==k) {
            count++;
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <= n-i; j++) {
                if (sum[i+j]-sum[j] == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}