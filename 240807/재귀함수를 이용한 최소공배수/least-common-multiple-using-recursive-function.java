import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main  {
    public void abc (int[] arr) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        while (true) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (max%arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt == n) {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Main main = new Main();
        main.abc(arr);
    }
}