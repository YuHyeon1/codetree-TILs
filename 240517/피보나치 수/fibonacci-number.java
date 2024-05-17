import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] fibonacci = new int[46];
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        for(int i = 3; i < 46; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(fibonacci[input]);
    }
}