import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] bubble = new int[input];
        for (int i = 0; i < input; i++) {
            bubble[i] = sc.nextInt();
        }
        for (int i = 0; i < input; i++) {
            for (int j=0;j<input-1-i;j++) {
                if (bubble[j] > bubble[j+1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < input; i++) {
            System.out.print(bubble[i]+" ");
        }
    }
}