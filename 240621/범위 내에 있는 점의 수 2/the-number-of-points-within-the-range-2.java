import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[1000001];
        int[] sum = new int[1000001];
        for (int i = 0; i < a; i++) {
            int r = sc.nextInt();
            arr[r]++;
        }
        for (int i =1; i < 1000001; i++){
            sum[i] = sum[i-1] + arr[i];
        }
        for (int i = 0; i < b; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(sum[B] - sum[A-1] );
        }
    }
}