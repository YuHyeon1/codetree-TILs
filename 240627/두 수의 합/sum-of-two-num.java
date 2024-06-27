import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        int r = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num,b-num);
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            int num = map.get(arr[i]);
            if (map.containsKey(num)) {
                r++;
            }
        }
        System.out.println(r/2);
    }
}