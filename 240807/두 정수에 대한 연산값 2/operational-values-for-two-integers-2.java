import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main  {
    public void hamsu (int a, int b) {
        if (a>b) {
           System.out.print(a*2+" "+b+10);
        }
        else {
            System.out.print(a+10+" "+b*2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        Main abc = new Main();
        abc.hamsu(x,y);
    }
}