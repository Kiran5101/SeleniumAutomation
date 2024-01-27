package JavaPrograms;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class HelloWorld {
 public static void printonlyDuplicates(){
	 int count;
     ArrayList<Integer> A1=new ArrayList<Integer>();
     ArrayList<Integer> A2=new ArrayList<Integer>();
     A1.add(10);
     A1.add(22);
     A1.add(12);
     A1.add(22);
     A1.add(10);
     A1.add(12);
     for(int i=0;i<A1.size();i++){
    	 count=1;
         for(int j=i+1;j<A1.size();j++) {
             if(A1.get(i)==A1.get(j)){
            	 count++;
            	 A1.set(j, 0);
             //A2.add(A1.get(i));
            	 
             }
         }
         if(count>1 && A1.get(i)!=0) {
        	 System.out.println(A1.get(i)+"::"+count);
         }
     }
		/*
		 * for(Integer i:A2){ System.out.println(i); }
		 */ }
 public static void main(String[] args) {
     printonlyDuplicates();
 }
}