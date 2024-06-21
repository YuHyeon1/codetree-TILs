import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] arra = new int[n+1];
        int[] arrb = new int[n+1];
        int[] arrc = new int[n+1];
        int[] suma = new int[n+1];
        int[] sumb = new int[n+1];
        int[] sumc = new int[n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a==1) {
                arra[i] = 1;
            }
            else if (a==2) {
                arrb[i] = 1;
            }
            else if (a==3) {
                arrc[i] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            suma[i] = suma[i-1] + arra[i];
            sumb[i] = sumb[i-1] + arrb[i];
            sumc[i] = sumc[i-1] + arrc[i];
        }
        for (int i=0;i<q;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.print(suma[b] - suma[a -1]+" ");
            System.out.print(sumb[b] - sumb[a -1]+" ");
            System.out.print(sumc[b] - sumc[a -1]+" ");
            System.out.println();
        }
    }
}