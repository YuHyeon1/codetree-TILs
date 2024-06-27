import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Long, Long> map = new HashMap<>();
        long[] arr = new long[a];
        int r = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < a; i++) {
            long num = arr[i];
            long target = b - num;
            if (map.containsKey(target)) {
                r++;
                if (map.get(target) == 1) {
                    map.remove(target);
                } else {
                    map.put(target, map.get(target) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0L) + 1);
            }
        }

        System.out.println(r);
    }
}