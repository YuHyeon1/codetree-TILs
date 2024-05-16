import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= a; i++) {
            queue.add(i);
        }
        while (queue.size()>0) {
            for (int i = 1; i < b; i++) {
                int temp = queue.remove();
                queue.add(temp);
            }
            System.out.print(queue.remove() + " ");
        }


    }
}