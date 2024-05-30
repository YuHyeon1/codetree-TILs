import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 첫 번째 줄에서 tree와 input 값을 읽어들임
        st = new StringTokenizer(br.readLine());
        int tree = Integer.parseInt(st.nextToken());
        int input = Integer.parseInt(st.nextToken());

        // TreeSet을 생성하고 tree 개수만큼 값을 읽어들임
        TreeSet<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tree; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // input 개수만큼 쿼리를 처리함
        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((set.subSet(a, b).size() + 1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}