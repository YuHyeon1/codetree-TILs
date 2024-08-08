import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = new int[] {1,0,-1,0};
        int[] dy = new int[] {0,1,0,-1};
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        String[] line = br.readLine().split("");

        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int r = (n-1)/2;
        int c = 3;
        int cnt = arr[r][r];
        int x = r;
        int y = r;
        for (int i=0;i<line.length;i++) {
            if (line[i].equals("R")) {
                if (c==3) {
                    c = 0;
                } else {
                    c++;
                }
            } else if (line[i].equals("L")) {
                if (c==0) {
                    c = 3;
                } else {
                    c--;
                }
            } else if (line[i].equals("F")) {
                if (x+dx[c]<n&&x+dx[c]>=0&&y+dy[c]<n&&y+dy[c]>=0) {
                    cnt += arr[y+dy[c]][x+dx[c]];
                    x = x+dx[c];
                    y = y+dy[c];
                }
            }
        } System.out.println(cnt);
    }
}