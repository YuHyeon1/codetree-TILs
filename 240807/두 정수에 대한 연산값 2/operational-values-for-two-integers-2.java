import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main  {
    public int hamsu (int a, int b) {
        if (a>b) {
            System.out.print(a*2+" ");
            return b+10;
        }
        else {
            System.out.print(a+10+" ");
            return b*2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        Main abc = new Main();
        System.out.print(abc.hamsu(x,y));
    }
}