import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i=0;i<3;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 1;
        for (int i=0;i<3;i++) {
            if (arr[i]<n) {
                arr[i] = n-arr[i]-2;
            } else {
                arr[i] = arr[i] - n;
            }
        }
        for (int i=0;i<3;i++) {
            cnt *= arr[i];
        }
        System.out.println(n*n*n-cnt);

    }
}