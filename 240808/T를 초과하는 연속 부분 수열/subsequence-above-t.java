import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acnt = 0;
        int n = sc.nextInt(); int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            int cnt = 0;
            if (arr[i]>t) {
                for (int j=i;j<n;j++) {
                    if (arr[j]>t) {
                        cnt++;
                    } else {
                        break;
                    }
                } if (acnt < cnt) {
                    acnt = cnt;
                }
            }
        } System.out.print(acnt);
    }
}