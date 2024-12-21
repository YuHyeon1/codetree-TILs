import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.\
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i<=b; i++) {
            String A = Integer.toString(i);
            String[] arr = A.split("");
            if (i%3==0) {
                count++;
            } else {
                for (int j = 0; j<arr.length; j++) {
                    if (Integer.parseInt(arr[j])%3==0 && Integer.parseInt(arr[j])>0) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}