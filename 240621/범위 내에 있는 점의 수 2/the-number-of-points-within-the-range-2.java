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
            if (r >= 0 && r < 1000001) {
                arr[r]++;
            }
        }
        
        sum[0] = arr[0];
        for (int i = 1; i < 1000001; i++){
            sum[i] = sum[i - 1] + arr[i];
        }
        
        for (int i = 0; i < b; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > 0 && B < 1000001 && A <= B) {
                System.out.println(sum[B] - sum[A - 1]);
            
        }
        
        sc.close();
    }
}