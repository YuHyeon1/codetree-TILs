import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[] arr = new String[200001];
        int k = 100000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "A";
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 1; j <= a; j++) {
                if (s.equals("R")) {
                    arr[k] = "R";
                    k++;
                    if (j == a) {
                        k--;
                    }
                } else if (s.equals("L")) {
                    arr[k] = "L";
                    k--;
                    if (j == a) {
                        k++;
                    }
                }
            }
        }
        int R = 0;
        int L = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("R")) {
                R++;
            } else if (arr[i].equals("L")) {
                L++;
            }
        }
        System.out.println(L + " " + R);
    }
}