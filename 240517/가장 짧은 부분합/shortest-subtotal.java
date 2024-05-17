import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        int min = input;
        int[] arr = new int[input];
        int[] sum = new int[input];
        for (int j = 0; j < input; j++) {
            arr[j] = sc.nextInt();
        }
        sum[0] = arr[0];
        for (int j = 1; j < input; j++) {
            sum[j] = arr[j] + sum[j-1];
        }
        if (sum[0] >= n) {
            System.out.println(1);
            System.exit(0);
        }
        else if (sum[input-1]<n) {
            System.out.println(-1);
            System.exit(0);
        }
        else {
            int temp = 0;
            for (int j = 1; j < input; j++) {
                if (sum[j] >= n) {
                    min = j+1;
                    temp = j;
                    break;
                }
            }
            for (int j = temp; j < input; j++) {
                if (sum[j] - sum[i]>=n) {
                    while (sum[j] - sum[i] >= n) {
                        if (min>j-i) {
                            min = j - i;
                        }
                        i++;
                    }
                }
            }
        }
        System.out.println(min);
    }
}