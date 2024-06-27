import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int[] arr = new int[a];
        int r = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            String key = num + "_" + (b - num); // 조합된 고유한 키 생성
            map.put(key, map.getOrDefault(key, 0) + 1);
            arr[i] = num;
        }
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            String key = num + "_" + (b - num);
            if (map.containsKey(key)) {
                r += map.get(key);
                // 이미 사용한 조합은 제거하여 중복 계산을 방지
                map.remove(key);
            }
        }
        
        // r 값을 2로 나눠서 출력
        System.out.println(r / 2);
    }
}