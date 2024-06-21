import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arra = new int[n+1][m+1];
        int[][] arrb = new int[n+1][m+1];
        int[][] arrc = new int[n+1][m+1];
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 1; j <=m; j++) {
                if (chars[j-1]=='a') {
                    arra[i][j] = 1;
                }
                else if (chars[j-1]=='b') {
                    arrb[i][j] = 1;
                }
                else if (chars[j-1]=='c') {
                    arrc[i][j] = 1;
                }
            }
        }
        int[][] suma = new int[n+1][m+1];
        int[][] sumb = new int[n+1][m+1];
        int[][] sumc = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                suma[i][j] = suma[i][j-1] +suma[i-1][j] +arra[i][j] - suma[i-1][j-1];
                sumb[i][j] = sumb[i][j-1] +sumb[i-1][j] +arrb[i][j] - sumb[i-1][j-1];
                sumc[i][j] = sumc[i][j-1] +sumc[i-1][j] +arrc[i][j] - sumc[i-1][j-1];
            }
        }
        for (int i=0; i<k; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int a = A-1;
            int b = B-1;
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.print(suma[c][d]-suma[a][d]-suma[c][b]+suma[a][b]+" ");
            System.out.print(sumb[c][d]-sumb[a][d]-sumb[c][b]+sumb[a][b]+" ");
            System.out.print(sumc[c][d]-sumc[a][d]-sumc[c][b]+sumc[a][b]+" ");
            System.out.println();
        }
    }
}