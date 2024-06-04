import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	HashMap<Integer, Integer> m = new HashMap<>();
    	int input = sc.nextInt();
    	sc.nextLine();
    	for (int i=0;i<input;i++) {
    		String a = sc.next();
    		if (a.equals("add")) {
    			int one = sc.nextInt();
    			int two = sc.nextInt();
    			m.put(one,two);
    		}
    		else if (a.equals("find")) {
    			int three = sc.nextInt();
    			if(m.containsKey(three)==true) {
    				System.out.println(m.get(three));
    			}
    			else {
    				System.out.println("None");
    			}
    		}
    		else if (a.equals("remove")) {
    			int four = sc.nextInt();
    			m.remove(four);
    		}
    	}
    }
}