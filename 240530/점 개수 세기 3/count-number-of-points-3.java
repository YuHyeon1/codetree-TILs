import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tree = sc.nextInt();
        int input = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0;i<tree;i++) {
            set.add(sc.nextInt());
        }
        for (int i=0;i<input;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(set.subSet(a,b).size()+1);
        }
    }
}