import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        int input = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<input;i++) {
        	String a = sc.nextLine();
        	String[] index = a.split(" ");
        	if (index[0].equals("push_back") ) {
        		al.add(Integer.parseInt(index[1]));
        	}
        	else if (index[0].equals("get")) {
        		System.out.println(al.get(Integer.parseInt(index[1])-1));
        	}
        	else if (index[0].equals("size")) {
        		System.out.println(al.size());
        	}
        	else if (index[0].equals("pop_back")) {
        		al.remove(al.size()-1);
        	}
        }
    }
}