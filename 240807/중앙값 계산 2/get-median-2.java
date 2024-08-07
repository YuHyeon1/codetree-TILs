import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int j=0;j<=n;j+=2) {
            int[] arr2 = new int[j+1];
            for (int i=0;i<=j;i++) {
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            System.out.print(arr[j/2]+" ");
        }
    }
}