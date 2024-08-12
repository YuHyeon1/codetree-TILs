import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j) {
                    list1.add(arr[j][0]);
                    list2.add(arr[j][1]);
                }
            }
            int x = Collections.max(list1) - Collections.min(list1);
            int y = Collections.max(list2) - Collections.min(list2);
            if (x*y<min) {
                min = x*y;
            }
            list1.clear();
            list2.clear();
        }
        System.out.println(min);
    }
}