import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i <= input; i++) {
            String[] a = sc.nextLine().split(" ");
            if (a[0].equals("N")) {
                y += Integer.parseInt(a[1]);
            }
            else if (a[0].equals("S")) {
                y -= Integer.parseInt(a[1]);
            }
            else if (a[0].equals("E")) {
                x += Integer.parseInt(a[1]);
            }
            else if (a[0].equals("W")) {
                x -= Integer.parseInt(a[1]);
            }
        }
        System.out.println(x + " " + y);
    }
}