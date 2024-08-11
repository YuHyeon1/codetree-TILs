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
        int[] ay = new int[3];
        for (int i=0;i<3;i++) {
            ay[i] = 0;
        }
        int cnt = 1;
        for (int i=0;i<3;i++) {
            if (n-arr[i]>2) {
                ay[i] += n-arr[i]-2;
            } if (arr[i]>3) {
                ay[i] += arr[i]-3;
            }
        }
        for (int i=0;i<3;i++) {
            cnt *= ay[i];
        }
        System.out.println(n*n*n-cnt);

    }
}