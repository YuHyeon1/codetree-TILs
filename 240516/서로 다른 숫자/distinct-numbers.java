import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            if (!set.contains(n)) {
                set.add(n);
            }
        }
        System.out.println(set.size());
    }
}