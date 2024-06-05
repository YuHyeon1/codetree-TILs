import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedMap<Integer,Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 0; i<n;i++) {
            map.put(sc.nextInt(),i);
        }

        for (int i = 0; i<q;i++) {
            SortedMap<Integer,Integer> map1 = map.subMap(sc.nextInt(),sc.nextInt()+1);
            System.out.println(map1.size());
        }
    }
}