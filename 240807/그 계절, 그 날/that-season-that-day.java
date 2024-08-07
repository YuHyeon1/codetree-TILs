import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int[] arr = new int[13];
        arr[1] = 31; arr[2] = 28; arr[3] = 31; arr[4] = 30;
        arr[5] = 31; arr[6] = 30; arr[7] = 31; arr[8] = 31;
        arr[9] = 30; arr[10] = 31; arr[11] = 30; arr[12] = 31;
        if (a%4==0){
            if (a%100==0) {
                if (a%400==0) {
                    arr[2]++;
                }
            } else {
                arr[2]++;
            }
        }
        if (c<=arr[b]) {
            if (b>=3&&b<=5) {
                System.out.print("Spring");
            } else if (b>=6&&b<=8) {
                System.out.print("Summer");
            } else if (b>=9&&b<=11) {
                System.out.print("Fall");
            } else {
                System.out.print("Winter");
            }
        } else {
            System.out.println(-1);
        }
    }
}