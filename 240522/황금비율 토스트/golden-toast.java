import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	LinkedList<Character> ll = new LinkedList<>();
    	int a = sc.nextInt();
    	int input = sc.nextInt();
    	sc.nextLine();
    	char[] bread = sc.nextLine().toCharArray();
    	for (int i=0;i<a;i++) {
    		ll.add(bread[i]);
    	}
    	ListIterator<Character> lt = ll.listIterator(ll.size());
    	for (int i=0;i<input;i++) {
    		String aa = sc.next();
    		String[] as = aa.split(" ");
    		if (aa.equals("L")) {
    			if (lt.hasPrevious()) {
    				lt.previous();
    			}
    		} else if (as[0].equals("P")) {
    			char[] kk = sc.next().toCharArray();
    			lt.add(kk[0]);
    		} else if (aa.equals("R")) {
    			if (lt.hasNext()) {
    				lt.next();
    			}
    		} else if (aa.equals("D")) {
    			if (lt.hasNext()) {
    				lt.next();
    				lt.remove();
    			}
    		}
    	}
    	while (lt.hasPrevious()) {
    		lt.previous();
    	}
    	while (lt.hasNext()) {
    		System.out.print(lt.next());
    	}
    	
    }
}