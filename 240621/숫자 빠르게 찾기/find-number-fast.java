import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int r = 0;
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(br.readLine());
            int left = 0;
            int right = n-1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] < a) {
                    left = mid + 1;
                }
                else if (arr[mid] > a) {
                    right = mid - 1;
                }
                else if (arr[mid] == a) {
                    System.out.println(mid+1);
                    r++;
                    break;
                }
            }
            if (r == 0) {
                System.out.println(-1);
            }
            r=0;
        }
    }
}