import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int input = Integer.parseInt(st.nextToken());
        for (int i = 0; i < input; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (!pq.isEmpty()) {
                    System.out.println(pq.poll());
                }
                else {
                    System.out.println(0);
                }
            }
            else {
                pq.add(n);
            }
        }
    }
}