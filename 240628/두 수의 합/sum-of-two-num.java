import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long[] arr = new long[(int) a];
        long r = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            long num = Long.parseLong(st.nextToken());
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
            if (map.containsKey(b-num)) {
                if (b-num == num) {
                    r = r + map.get(b-num)-1;
                } else {
                    r = r + map.get(b - num);
                }
            }
        }

        System.out.println(r);
    }
}