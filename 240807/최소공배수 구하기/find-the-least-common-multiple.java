import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n,m=0;
        if (a > b){
            n=b;    m=a;
        }
        else {
            n=a;    m=b;
        }
        for (int i = m;i<10000;i++) {
            if (i%n==0&&i%m==0) {
                System.out.println(i);
                break;
            }
        }
        

    }
}