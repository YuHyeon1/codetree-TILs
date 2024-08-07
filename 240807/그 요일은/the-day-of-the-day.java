import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int m1 = Integer.parseInt(st.nextToken()); int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken()); int d2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String day = st.nextToken();
        int[] month = new int[13];
        month[1] = 31; month[2] = 29; month[3] = 31; month[4] = 30; month[5] = 31; month[6] = 30;
        month[7] = 31; month[8] = 31; month[9] = 30; month[10] = 31; month[11] = 30; month[12] = 31;
        int cnt = 0;
        for (int i = 1; i < m1; i++) {
            d1 += month[i];
        }
        for (int i = 1; i < m2; i++) {
            d2 += month[i];
        }
        cnt = (d2-d1+1)/7;
        map.put("Sun",0); map.put("Mon",1); map.put("Tue",2); map.put("Wed",3);
        map.put("Thu",4); map.put("Fri",5); map.put("Sat",6);
        if (map.containsKey(day)) {
            int k = map.get(day);
            if (k==0&&d2-d1+1>=7) {
                cnt--;
            }
            if (k<=(d2-d1+1)%7) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}