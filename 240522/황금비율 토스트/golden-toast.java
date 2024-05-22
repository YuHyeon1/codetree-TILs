import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> ll = new LinkedList<>();
        
        int a = Integer.parseInt(br.readLine().trim()); // Read the size of the list
        char[] bread = br.readLine().trim().toCharArray(); // Read the initial characters
        for (int i = 0; i < a; i++) {
            ll.add(bread[i]);
        }
        
        ListIterator<Character> lt = ll.listIterator(ll.size());
        int input = Integer.parseInt(br.readLine().trim()); // Read the number of commands
        
        for (int i = 0; i < input; i++) {
            String aa = br.readLine().trim();
            String[] as = aa.split(" ");
            switch (as[0]) {
                case "L":
                    if (lt.hasPrevious()) {
                        lt.previous();
                    }
                    break;
                case "P":
                    lt.add(as[1].charAt(0));
                    break;
                case "R":
                    if (lt.hasNext()) {
                        lt.next();
                    }
                    break;
                case "D":
                    if (lt.hasNext()) {
                        lt.next();
                        lt.remove();
                    }
                    break;
            }
        }
        
        // Move the cursor to the beginning of the list
        while (lt.hasPrevious()) {
            lt.previous();
        }
        // Output all characters
        while (lt.hasNext()) {
            System.out.print(lt.next());
        }
        br.close();
    }
}