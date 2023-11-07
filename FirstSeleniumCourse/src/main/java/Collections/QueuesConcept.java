package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesConcept {
	public void createPriorityQueue() {
		Queue<String> Q1=new PriorityQueue();
		//Q1.add("Kiran");
		Q1.add("CHaran");
		Q1.add("Raavan");
		Q1.add("Javan");
		Q1.add("Maran");
		
		System.out.println("Head :"+Q1.peek());
		System.out.println("Head :"+Q1.element());
		for(String s:Q1) {
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		QueuesConcept  QC=new QueuesConcept();
		QC.createPriorityQueue();
		
	}

}
