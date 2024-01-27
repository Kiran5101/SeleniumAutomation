package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import FirstSeleniumCourse.FirstSeleniumCourse.CapabilitiesConcept;

public class ArrayPrograms extends CapabilitiesConcept {
	
	public void reversString(String text) {
		String inputText=text;
		//StringBuilder sb=new StringBuilder(inputText);
		StringBuffer sb1=new StringBuffer(inputText);
		sb1.reverse();
		System.out.println(sb1.toString());
	}
	public String reverseStringBy(String text) {
		String input=text;
		char[] ch=input.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
	public static ArrayList<String> copyingArrayList() {
		ArrayList<String> A1=new ArrayList<String>();
		A1.add("Kiran");
		A1.add("Charan");
		A1.add("Mysore");
		A1.add("Coorg");
		A1.add("Chikkamangalore");
		
		ArrayList<String> A2=new ArrayList<String>();
		A2.clone();
		for(int i=0;i<A1.size();i++) {
			//A2.add(A1.get(i));
		}
		return A2;
	}
	public int elementFrequency(String EnterText) {
		String [] text=EnterText.split("\\s");
		List<String> A1=Arrays.asList(text);
		int count = 1;
		for(int i=0;i<A1.size();i++) {
			for(int j=i+1;j<A1.size();j++) {
				if(A1.get(i).equals(A1.get(j))) {
					count++;
					A1.set(j, null);
			}
			}
			if(count>1 &&A1.get(i)!="0")
				System.out.println(A1.get(i)+"------->"+count);
				count=1;
		}			
		return count;
	}
	public static void reversingArrayList() {
 		int Temp=0;
		ArrayList<Integer> A1=new ArrayList<Integer>();
		ArrayList<Integer> A2=new ArrayList<Integer>();
		
		A1.add(1234);
		A1.add(54344);
		A1.add(453356);
		A1.add(425);
		A1.add(56);
		/*
		 * for(int i=0;i<A1.size();i++) { for(int j=i+1;j<A1.size();j++) { if(A1.get(i)>
		 * A1.get(j)){ Temp=A1.get(j); A1.add(i, A1.get(j)); A1.add(j, Temp); } } }
		 */
		Collections.sort(A1,Collections.reverseOrder());
		for(int i=0;i<A1.size();i++) {
			System.out.print(A1.get(i)+" ");
		}
		
	}
	public void reverseString(String InputText) {
		String givenText=InputText,OutputString=null;
		char[] dee=givenText.toCharArray();
		for(int i=dee.length-1;i>=0;i--) {
			OutputString+=dee[i];
			
		}
		System.out.println("Reversed String"+OutputString);
		
	}
	 public  void printDuplicateChars(String str){
	        String S=str;
	        int count;
	        S=S.replace(" ","");
	        S=S.toLowerCase();
	        char[] ch=S.toCharArray();
	        for(int i=0;i<ch.length;i++){
	            count=1;
	            for(int j=i+1;j<ch.length;j++){
	                if(ch[i]==ch[j]){
	                    count++;
	                    ch[j]=0;
	                }
	            }
	            if(count>1 && ch[i]!=0){
	                System.out.println(ch[i]+"::"+count);
	            }
	        }
	    }
	public static void main(String[] args) {
		ArrayPrograms Ap=new ArrayPrograms();
		//for(String s:copyingArrayList()) {
		//	System.out.println(s);
		//}
		//Ap.elementFrequency("kiran is kiran hello kiran");
		//Ap.reversString("Kiran Kumar Reddy");
		//System.out.println(Ap.reverseStringBy("I love selenium testing"));
		//reversingArrayList();
		//Ap.reverseString("Hello world");
		Ap.printDuplicateChars("Kiran kumar Reddy");
		try {
			HandlingWindows();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
