import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Long, List<Integer>> map = new HashMap<>();
        long[] arr = new long[a];
        int r = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            long num = Long.parseLong(st.nextToken());
            long target = b - num;
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>(Arrays.asList(i, -1)));
            } else if (map.get(num).get(1) == -1) {
                map.get(num).set(1, i);
            }
            arr[i] = num;
        }
        
        for (int i = 0; i < arr.length; i++) {
            long num = arr[i];
            long target = b - num;
            if (map.containsKey(target)) {
                List<Integer> indices = map.get(target);
                if (indices.get(0) != i && indices.get(1) != i) {
                    r++;
                    // 해당 값을 사용한 후 제거하여 중복 계산 방지
                    map.remove(target);
                } else if (indices.get(0) == i) {
                    indices.set(0, -1);
                } else if (indices.get(1) == i) {
                    indices.set(1, -1);
                }
            }
        }
        
        // r 값을 2로 나눠서 출력
        System.out.println(r / 2);
    }
}