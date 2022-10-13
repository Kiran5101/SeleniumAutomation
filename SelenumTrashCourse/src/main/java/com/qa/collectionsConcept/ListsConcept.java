package com.qa.collectionsConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListsConcept {
	// method for inserting and iterating the elements
	public void insertAndIterating(int a, int b, int c, int d, int e) {
		Vector<Integer> V = new Vector<Integer>();
		V.add(a);
		V.add(b);
		V.add(c);
		V.add(d);
		V.add(e);
		Iterator<Integer> itr = V.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

	// method to demonstrate Stack collection
	public void insertElementsIntoStack(int a, int b, int c, int d) {
		Stack<Integer> S = new Stack<Integer>();
		S.push(a);
		S.push(b);
		S.push(c);
		S.push(d);
		S.pop();
		Iterator<Integer> itr = S.iterator();
		System.out.println("First element+" + S.get(3));
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public void insertingElemetstoQueue(String a, String b, String c, String d, String e) {
		Queue<String> Q = new PriorityQueue<String>();
		Q.add(a);
		Q.add(b);
		Q.add(c);
		Q.add(d);
		Q.add(e);
		System.out.println("Head of the Queue:" + Q.element());
		System.out.println("Head of the Queue using peek:" + Q.peek());
		Q.poll();
		System.out.println("head of the Queue after removing one element" + Q.peek());
		Iterator<String> itr = Q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// methods to demonstrate SetCollections
	public void insertingElementstoHashSet(String a, String b, String c, String d, String e) {
		Set<String> S = new HashSet<String>();
		S.add(a);
		S.add(b);
		S.add(c);
		S.add(d);
		S.add(e);
		Iterator<String> itr = S.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void insertingElementstoLinkedHashSet(int a, int b, int c, int d, int e) {
		LinkedHashSet<Integer> LH = new LinkedHashSet<Integer>();
		LH.add(a);
		LH.add(b);
		LH.add(c);
		LH.add(d);
		LH.add(e);
		for (int i : LH) {
			System.out.println(i);
		}
	}

	public void insertingElementstoTreeSet(String a, String b, String c, String d, String e) {
		TreeSet<String> TS = new TreeSet<String>();
		TS.add(a);
		TS.add(b);
		TS.add(c);
		TS.add(d);
		TS.add(e);
		for (String i : TS) {
			System.out.println(i);
		}

	}

	public void insertingElementstoMapsUsingWhileLoop(String A, int a, String B, int b, String C, int c, String D,
			int d, String E, int e) {
		Map<String, Integer> M = new HashMap<String, Integer>();
		M.put(A, a);
		M.put(B, b);
		M.put(C, c);
		M.put(D, d);
		M.put(E, e);
		Iterator<Entry<String, Integer>> itr = M.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public void insertingElementstoSortedMap(int A, double a,int B, double b,int C, double c,int D, double d,int E, double e) {
		LinkedHashMap<Integer,Double> SM=new LinkedHashMap<>();
		SM.put(A,a);
		SM.put(B,b);
		SM.put(C, c);
		SM.put(D, d);
		SM.put(E, e);
		Iterator<Entry<Integer,Double>> itr=SM.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer,Double> entry=itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		ListsConcept L = new ListsConcept();
		// L.insertAndIterating(2, 5, 8, 9, 10);
		// L.insertElementsIntoStack(20, 5, 7, 23);
		// L.insertingElemetstoQueue("Kiran", "", "lakshmi", "venkat", "vinod");
		// L.insertingElementstoHashSet("Kiran", "Charan", "Kiran", "Charan", " ");
		// L.insertingElementstoLinkedHashSet(0, 2, 0, 2, 10);
		// L.insertingElementstoTreeSet("KIa", "Thar", "Thar", "Tata", "toyota");
		// L.insertingElementstoMapsUsingWhileLoop("Kiran", 5101, "Aditya", 5076,
		 //"siva", 5072, "Ram", 5103, "Sita", 5100);
		 L.insertingElementstoSortedMap(1, 74000, 2, 43000, 3, 560000, 4, 65000, 5,45600);
		/*
		 * Map<String, Integer> M = new HashMap<>(); M.put("Kiran", 5101);
		 * M.put("charan", 5120); M.put("Ram", 5234); M.put("seeta", 5456);
		 * System.out.println(M.get("charan")); Iterator<Entry<String, Integer>> itr =
		 * M.entrySet().iterator();
		 * 
		 * while(itr.hasNext()) { Entry<String,Integer> entry=itr.next();
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 * for(Map.Entry<String, Integer> entry:M.entrySet()) {
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 */
	}
}
