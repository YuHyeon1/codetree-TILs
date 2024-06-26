import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int a = Integer.parseInt(st.nextToken());
        String[] indexline = new String[a];
        br.readLine();
        int r = 0;
        int max = 0;
        for (int i = 0; i < a; i++) {
            String line = br.readLine();
            if (map.containsKey(line)) {
                map.put(line, map.get(line) + 1);
            }
            else {
                indexline[r] = line;
                r++;
                map.put(line, 1);
            }
        }
        for (int i = 0; i < indexline.length; i++) {
            if (map.containsKey(indexline[i])) {
                if (map.get(indexline[i]) > max) {
                    max = map.get(indexline[i]);
                }
            }
        }
        System.out.println(max);

    }
}