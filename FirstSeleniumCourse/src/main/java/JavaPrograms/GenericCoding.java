package JavaPrograms;

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
			if(!(Character.isAlphabetic(ch[i]))&& !(Character.isDigit(ch[i])) && !(Character.isWhitespace(ch[i]))) {
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
		
	public static void main(String[] args) {
		GenericCoding GC=new GenericCoding();
		//GC.fibonacciSeries(8);
		//System.out.println(GC.isPrime(5));
		//System.out.println(GC.IsPolindrome(131));
		//System.out.println(GC.IsArmString(153));
		//GC.printSpecialCharectars("fbefb @bfgf$ bfhb%@!");
		primesRange(11);
	}

}
