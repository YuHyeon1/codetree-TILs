import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int acnt = 0;
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0;i<n;i++) {
            int cnt=0;
            for (int j=i;j<n;j++) {
                if (arr[j]==arr[i]) {
                    cnt++;
                } else {
                    break;
                }
            } if (acnt<cnt) {
                acnt = cnt;
            }
        } System.out.print(acnt);
    }
}