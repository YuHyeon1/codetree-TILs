import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(st.nextToken());
            map.put(n,i+1);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (map.containsKey(n)) {
                System.out.print(map.get(n) + " ");
            }
            else {
                System.out.print(0+" ");
            }
        }

    }
}