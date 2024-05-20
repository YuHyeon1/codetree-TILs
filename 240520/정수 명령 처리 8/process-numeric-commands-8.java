import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList();
        int input = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < input; i++) {
            String[] a = sc.nextLine().split(" ");
            if (a[0].equals("push_front")) {
                list.addFirst(Integer.parseInt(a[1]));
            }
            else if (a[0].equals("push_back")) {
                list.addLast(Integer.parseInt(a[1]));
            }
            else if (a[0].equals("pop_front")) {
                System.out.println(list.removeFirst());
            }
            else if (a[0].equals("pop_back")) {
                System.out.println(list.removeLast());
            }
            else if (a[0].equals("size")) {
                System.out.println(list.size());
            }
            else if (a[0].equals("empty")) {
                if (list.isEmpty()) {
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }
            }
            else if (a[0].equals("front")) {
                System.out.println(list.getFirst());
            }
            else if (a[0].equals("back")) {
                System.out.println(list.getLast());
            }
        }
    }
}