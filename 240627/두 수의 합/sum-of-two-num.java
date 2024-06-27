import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Long, List<Long>> map = new HashMap<>();
        long[] arr = new long[a];
        int r = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            long num = Long.parseLong(st.nextToken());
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add((long) i);
            arr[i] = num;
        }
        
        for (int i = 0; i < arr.length; i++) {
            long num = arr[i];
            long target = b - num;
            if (map.containsKey(target)) {
                List<Long> targetIndices = map.get(target);
                if (!targetIndices.isEmpty()) {
                    r++;
                    targetIndices.remove(targetIndices.size() - 1);  // 가장 마지막 요소를 제거
                    if (targetIndices.isEmpty()) {
                        map.remove(target);
                    }
                }
            }
        }
        
        System.out.println(r / 2);
    }
}