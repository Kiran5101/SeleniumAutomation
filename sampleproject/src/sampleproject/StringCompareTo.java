package sampleproject;

import java.util.ArrayList;

public class StringCompareTo {
	public static void main(String[] args) {
	ArrayList<String> List1 = new ArrayList<String>();
	List1.add("42023");
	List1.add("912810FP8");
	List1.add("AAPL");
	List1.add("AAAV");
	List1.add("AF00724");
	for(int i=0;i<List1.size();i++) {
		for(int j=i+1;j<List1.size();j++) {
			if(List1.get(i).compareTo(List1.get(j))==1); {
			System.out.println("List is in ascending order");	
			}
			else if(List1.get(i).compareTo(List1.get(j))==-1){
				System.out.println("Descending order");	
			}
		}
	
	//System.out.println("List has ascending order of strings");
}
}
}
