package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListConcept {
	public static void main(String[] args) {
		LinkedList<String> L2 = new LinkedList<String>();
		LinkedList<Double> AC = new LinkedList<Double>();
		List<Integer> L1 = new ArrayList<Integer>();
		Vector<Float> V1 = new Vector<Float>();
		Stack<Double> S1 = new Stack<Double>();

		// Inserting numbers to L1 arraylist
		L1.add(20);
		L1.add(58);
		L1.add(29);
		L1.add(87);

		// Inserting Names to L2 LinkedList
		L2.add("Kiran");
		L2.add("Mounika");
		L2.add("Ram");
		L2.add("Lakshmi");
		L2.
		
		// Inserting salaries to V1 vector
		V1.add(20.98f);
		V1.add(45.76f);
		V1.add(22.11f);
		V1.add(53.98f);
		V1.
	
		// Inserting temperatures into S1 Stack
		S1.add(3890.3443);
		S1.add(6575.2143);
		S1.add(3462.8956);
		S1.add(3243.6798);
		S1.push(2394.4434);
		
		// Inserting data to the AC Linked list
		AC.add(1234.5678);
		AC.add(4567.8901);
		AC.add(8901.2345);
		AC.add(5678.9012);
		S1.addAll(AC);

		System.out.println("Head :" + S1.peek());

		S1.pop();

		
		/*Iterator<Integer> itr=L1.iterator(); 
        while(itr.hasNext()) {
		 System.out.println(itr.next()); }
		 
		 Iterator<String> itr1=L2.iterator();
		 while(itr1.hasNext()) { 
			 System.out.println(itr1.next());
			 } 
		  
		 Iterator<Float> itr2=V1.iterator();
		 while(itr2.hasNext()) {
		 System.out.println(itr2.next()); 
		 }*/
		 
		Iterator<Double> itr3 = S1.iterator();
		while (itr3.hasNext()) {
		System.out.println(itr3.next());
		}
		
		System.out.println("Sorting the stack");
		//Collections.sort(S1);
		Collections.reverse(S1);
		for(Double d:S1) {
			System.out.println(d);
		}
	}

}
