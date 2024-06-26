import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] indexline = new String[a];
        
        for (int i = 0; i < a; i++) {
            String line = br.readLine();
            map.put(line,i+1);
            indexline[i] = line;
        }

        for (int i = 0; i < b; i++) {
            String line = br.readLine();
            if (map.containsKey(line)) {
                System.out.println(map.get(line));
            }
            else {
                int num = Integer.parseInt(line);
                System.out.println(indexline[num-1]);
            }
        }

    }
}