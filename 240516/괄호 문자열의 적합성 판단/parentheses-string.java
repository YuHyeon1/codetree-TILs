import java.io.*;
import java.util.*;


public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String Line =br.readLine();
        int count =0;

        for (int i = 0; i < Line.length(); i++) {
            char c = Line.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    count++;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()&&count==0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}