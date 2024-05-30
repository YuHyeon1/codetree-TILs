import java.util.Scanner;
import java.util.TreeSet;

class Pair {
    int a, b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        Pair[] queries = new Pair[q];
        TreeSet<Integer> nums = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            nums.add(arr[i]);
        }

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            queries[i] = new Pair(a, b);
        }

        // 각 쿼리에 대해 결과 계산 및 출력
        for (int i = 0; i < q; i++) {
            int a = queries[i].a;
            int b = queries[i].b;
            int count = nums.subSet(a, b + 1).size();
            System.out.println(count);
        }
    }
}