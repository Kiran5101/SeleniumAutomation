package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
	
	public void hashSet_method() {
		Set<String> s1=new HashSet<String>();
		s1.add("Hello");
		s1.add("World");
		s1.add("");
		s1.add("Mysore");
		s1.add("Santoor");
		s1.add("World");
		
		for(String s:s1) {
			System.out.println(s);
		}
	}
	public void LinkedHashSet_Method() {
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(20);
		l1.add(30);
		l1.add(30);
		l1.add(40);
		l1.add(0);
		
		 Iterator<Integer> itr=l1.iterator(); 
		 while(itr.hasNext()) {
		 System.out.println(itr.next());
		 }
	}
	public void treeSet_Method() {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator itr=set.descendingIterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	
	public static void main(String[] args) {
		SetConcept Sc=new SetConcept();
		//Sc.hashSet_method();
		System.out.println("linked has set:");
		Sc.LinkedHashSet_Method();
		//Sc.treeSet_Method();
	}
}
