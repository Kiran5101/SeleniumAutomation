package JavaPrograms;

public class Practice {
	public static String reverseString_UsingDefaultMethod(String entText) {
		StringBuffer Text=new StringBuffer(entText);
		Text.reverse();
		Text.replace(2, 4, Text.toString());
		return Text.toString();
	}
	public static String reverseString_usingLoops(String entText) {
		String text=entText,RevText="";
		char[] ch=text.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			RevText+=ch[i];
		}
		return RevText;
	}
	public static String capitalizeWord(String inputText) {
		String capitalizedText="";
		//String s1=inputText.replaceAll("[^a-zA-Z0-9]"," ");
		String s1=inputText.replaceAll("\\W"," ");
		String[] words=s1.split(" ");
		for(String s:words) {
			String firstLetter=s.substring(0,1).toUpperCase();
			capitalizedText+=firstLetter.toUpperCase()+s.substring(1)+" ";
		}
		return capitalizedText.trim();
	}
	public static void isPrime(int number) {
		int Num=number,count=0;
		if(Num<=1) {
			System.out.println("Given Number["+Num+"]is not a prime number");
		}
		else {
			for(int i=2;i<Num;i++) {
				if(Num%2==0) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println("Given Number["+Num+"]is not a prime number");
			}
			else {
				System.out.println("Given Number["+Num+"]is is a prime number");
			}
		}
	}
	public static void PrimeswithinRange(int Range) {
		int Limiter=Range;
		int count;
		for(int i=1;i<=Limiter;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0 && i!=1) {
				System.out.println(i+" ");
			}
		}
	}
	public static void repeatedCharacters(String enterText) {
		char[] ch=enterText.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
			System.out.println(ch[i]+"::"+count);
			}
		}
	}
	public static void  repeatedWords(String enterText) {
		String str1=enterText.toLowerCase();
		String[] s1=str1.split("\\W");
		int count;
		for(int i=0;i<s1.length;i++) {
			count=1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					count++;
					s1[j]="0";
				}
			}
			if(s1[i]!="0" ) {
				System.out.println(s1[i]+"::"+count);
			}
		}
	}
	public static void isArmstrong(int number) {
			int num=number,Reminder,temp=0;
			while(num!=0) {
				Reminder=num%10;
				temp=temp+(Reminder*Reminder*Reminder);
				System.out.println(temp);
				num=num/10;
			}
			if(temp==number) {
				System.out.println("Given number["+number+"]is a armstrong");
			}
			else {
				System.out.println("Given number["+number+"]is not a armstrong");
			}
			
	}
	public static void isPolydrome(int number) {
		int num=number,Remainder=0,temp=0;
		while(num!=0) {
			Remainder=num%10;
			temp=(temp*10)+Remainder;
			num=num/10;
		}
		if(temp == number) {
			System.out.println("Given number["+number+"]is a Polyndrome");
		}
		else {
			System.out.println(number);
			System.out.println("Given number["+number+"]is not a Polyndrome");
		}
	}
	public static String specialChar(String text) {
		String s="";
		char[] ch=text.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!(Character.isAlphabetic(ch[i])) && !(Character.isDigit(ch[i]) && !(Character.isWhitespace(ch[i])))) {
				s+=ch[i];
			}
		}
		return s;
	}
	public static void printPattern(int RowCount) {
		for(int i=1;i<=RowCount;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void printLeftTraingle(int RowCount) {
		for(int i=0;i<=RowCount;i++) {
			for(int j=RowCount;j>=i;j--) {
				System.out.print("");
			}
			System.out.println("*");
		}
		
	}
	public static void main(String[] args) {
		//System.out.println(reverseString_UsingDefaultMethod("Hello World"));
		//System.out.println(reverseString_usingLoops("Java Oops Concepts"));
		//System.out.println(capitalizeWord("hello@kiran,how!are$you$man*i&am^in%bangalore"));
		//isPrime(11);
		//PrimeswithinRange(100);
		//repeatedCharacters("Hello");
		//repeatedWords("Hello Kiran Hello Mounika Kiran are you there kiran and mounika ");
		//isArmstrong(153);
		//isPolydrome(124341);
		//System.out.println(specialChar("dfjjkf!bhbf@bfvbs#snkjgs%nbfbk&,mNn8"));
		//printPattern(4);
		printLeftTraingle(4);
	}

}
