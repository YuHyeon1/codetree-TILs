import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i =0; i<5;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int min = sum;
        for (int i =0; i<5;i++) {
            int[] mm = new int[3];
            for (int j = i+1; j<5;j++) {
                mm[0] = arr[i]+arr[j];
                for (int k = 0; k<5;k++) {
                    if (k!=i && k!=j) {
                        mm[1] = arr[k];
                        mm[2] = sum - mm[0]-mm[1];
                        int mn = sum;
                        int mx = 0;
                        for (int e =0; e<3;e++) {
                            if (mm[e]<mn) {
                                mn = mm[e];
                            }
                            if (mm[e]>mx) {
                                mx = mm[e];
                            }
                        }
                        if (mm[0]!=mm[1]&&mm[1]!=mm[2]&&mm[0]!=mm[2]) {
                            if (min>mx-mn) {
                                min = mx-mn;
                            }
                        }
                    }
                    }
                }
            }

        if (min==sum) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}