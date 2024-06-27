import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Long, Long> map = new HashMap<>();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long[] arr = new long[(int) a];
        long r = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            long num = Long.parseLong(st.nextToken());
            map.put(num, b - num);
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            long num = map.get(arr[i]);
            if (map.containsKey(num)) {
                r++;
            }
        }
        System.out.println(r / 2);
    }
}