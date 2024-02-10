package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCoding {
	public void fibonacciSeries(int Count) {
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<Count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public boolean isPrime(int Num) {
		boolean flag=true;
		if(Num<=1) {
			flag=false;
		}
		else {
			for(int i=2;i<=Num;i++) {
				if(Num%i==0) {
					flag=false;
				}
			}
		}
		return flag;
	}
	public boolean IsPolindrome(int Num) {
		boolean flag;
		int Reversed=0,Number=Num;
		
		while(Number!=0) {
			int r=Number%10;
			Reversed=(Reversed*10)+r;
			Number=Number/10;
		}
		if(Reversed == Number) {
			System.out.println("Given number is a plondrome");
			flag=true;
		}
		else {
			System.out.println("Given number is not a polyndrome");
			flag=false;
		}
		return flag;
	}
	public boolean IsArmString(int Num) {
		boolean flag;
		 int temp=0,Number=Num;
		 
		 while(Number!=0) {
			 int r=Number%10;
			 temp=(temp)+(r*r*r);
			 Number=Number/10;
		 }
		 if(temp==Num) {
			 flag=true;
			 System.out.println("given number is Armstring");
		 }
		 else {
			 flag=false;
			 System.out.println("Given numbe is not armstrong");
		 }
		
		return flag;
	}
		//printing only the special charectars from a string
	public void printSpecialCharectars(String str) {
		String s ="";
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!(Character.isAlphabetic(ch[i])&& !(Character.isDigit(ch[i])) && !(Character.isWhitespace(ch[i])))) {
				s+=ch[i];
			}
		}
		System.out.println(s);
	}
	 public static void primesRange(int enterRange){
	        int Num=enterRange;
	        if(Num<=1){
	            //System.out.println(Num);
	        }
	        	System.out.println("Hello");
	            for(int i=2;i<=Num;i++){
	                if(Num%i==0){
	                    System.out.println(i);  
	                }  
	        }
	    }
	 public static void printDuplicats_Map(String sen) {
		 String S=sen;
		 String [] S1=S.split("\\W");
		 Map<String,Integer> map=new HashMap();
		 
		 
	 }
	 public static void printDiplicates(String s){
	        String[] s1=s.split("\\W");
	        HashMap<String,Integer> map=new HashMap<String,Integer>();
	        for(String d:s1){
	            if(map.containsKey(d)){
	                map.put(d,map.get(d)+1);//
	            }
	            else{
	                map.put(d,1);
	            }
	        }
	        System.out.println(map);
	    }
	 public static void printchars(String s){
	        int count;
	       char[] ch=s.toCharArray();
	       for(int i=0;i<ch.length;i++){
	           count=1;
	           for(int j=i+1;j<ch.length;j++){
	               if(ch[i]==(ch[j])){
	                   count++;
	                   ch[j]='0';
	               }
	           }
	           if(count>1 && ch[i]!='0'){
	           System.out.println(ch[i]+"::"+count);
	           }
	       }
	 }
	 public static void printingonlySpecialcharacters(String s){
	        String tem="";
	        String st=s.replace(" ","");
	        char[] ch=st.toCharArray();
	        for(char c:ch){
	        	
	            if((Character.isAlphabetic(c)) || (Character.isDigit(c)) || (Character.isWhitespace(c))){
	                tem+=c;
	            }
	        }
	        System.out.println(tem);
	    }
	 public static void coverting_arraytoList() {
		 int count;
		 String[] s= {"Kiran","Kiran","Vinod","Mounika"};
		 List<String> list=Arrays.asList(s);
		 for(int i=0;i<list.size();i++) {
			 count=1;
			 for(int j=i+1;j<list.size();j++) {
			 if(list.get(i)==list.get(j)) {
				 count++;
				 list.set(j, null);
			 }
			 }
			 if(count>1 && list.get(i)!=null ) {
				 System.out.println(list.get(i)+"::"+count);
			 }
		 }
		 
	 }
	 public static void printPattern() {
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 public static void printleft_Triangle_Pattern() {
		 for(int i=5;i>0;i--) {
			 for(int j=5;j<=i;j--) {
				 System.out.print("");
			 }
			 System.out.println("*");
		 }
	 }
	 public static void reversetheString(String s){
		 String w=s;
		 w=w.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(w);
	 }
	  
	 public static void printReveresed(String s){
	        String s1=s,temp="";
	        char[] ch=s1.toCharArray();
	        int index=ch.length-1;
	        while(index >= 0){
	        	//System.out.print(ch[index]);
	            temp+=ch[index];
	            index--;
	        }
	        System.out.println(temp);
	    }

		/*
		 * //Program to take the array of heads and trails ,need to update alternatively
		 * and then return the count of alterations made.
		 * input=[1,0,0,1,1,0]-----> output [1,0,1,0,1,0] return 2;
		 */
		 public static int solution(int[] a){
		        int flips=0;
		        int [] sequenece=a;
		        boolean changeNeeded=false;
		        for(int i=1;i<sequenece.length;i++){
		            if(sequenece[i]==sequenece[i-1]){
		                flips++;
		                changeNeeded=true;
		            }
		            if(sequenece[i]==1 && changeNeeded ){
		                sequenece[i]=0;
		                changeNeeded=false;
		            }else if(sequenece[i]==0 && changeNeeded ){
		                sequenece[i]=1;
		                changeNeeded=false;
		            }
		        }
		        return flips;
		    }
		 public static void solution(String s){
		        String si=s,temp="";
		        si=si.toUpperCase();
		        char[] ch=si.toCharArray();
		        for(int i=1;i<ch.length;i++){
		               int value=Character.compare(ch[i],ch[i-1]);
		               if(value>=0){
		                   temp+=ch[i];
		            }
		        }
		        System.out.println(temp);
		        
		    }
		static // you can also use imports, for example:
		// import java.util.*;

		// you can write to stdout for debugging purposes, e.g.
		// System.out.println("this is a debug message");

		class Solution {
		    public static int summingMethod(int n){
		        int Num=n,GivenDigitsSum=0;
		        while(Num!=0){
		            int R=Num%10;
		            GivenDigitsSum+=R;
		            Num=Num/10;
		        }
		        return GivenDigitsSum;
		    }
		    
		    public static int solution(int N) {
		        int input=N,Required=0;
		        int Temp1=summingMethod(input);
		        int Temp2=0;
		        for(int i=input;i>input;i++){
		            System.out.println(i);
		            Temp2+=summingMethod(i);
		            if(Temp1==Temp2){
		                Required+=i;
		                System.out.println(i);
		                break;
		            }
		        }
		        return Temp2;
		    }
		}
	public static void main(String[] args) {
		GenericCoding GC=new GenericCoding();
		//GC.fibonacciSeries(8);
		//System.out.println(GC.isPrime(5));
		//System.out.println(GC.IsPolindrome(131));
		//System.out.println(GC.IsArmString(153));
		//GC.printSpecialCharectars("fbefb @bfgf$ bfhb%@!");
		//primesRange(11);
		//printDiplicates("hello world hello java hello world hello");
		//printingonlySpecialcharacters("BHDh*^$%$  hfj %^*&*");
		//coverting_arraytoList();
		//printPattern();
		//printleft_Triangle_Pattern();
		//reversetheString("Ki^%^&98^%#&^:ran");
		//printReveresed("Kiran Kumar");
		//int[] b= {0,1,0};
		//System.out.println(solution(b));
		//solution("AABBABA");
		solution(28);
	}

}
