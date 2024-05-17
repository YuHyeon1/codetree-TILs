import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[input];
        int[] sum = new int[input];
        int[] answer = new int[input-n+1];
        int max = 0;
        for (int i = 0; i < input; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        sum[0] = arr[0];
        for (int i = 0; i < input-1; i++) {
            sum[i+1] = sum[i]+arr[i+1];
        }
        answer[0] = sum[n-1];
        for (int i = 1; i < input-n+1; i++) {
            answer[i] = sum[n+i-1]-sum[i-1];
        }
        for (int i = 0; i < input-n+1; i++) {
            max = Math.max(max, answer[i]);
        }
        System.out.println(max);
    }
}