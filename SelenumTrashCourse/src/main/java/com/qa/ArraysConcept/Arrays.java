package com.qa.ArraysConcept;

public class Arrays {
	//method to get minimum of array numbers
	public int getMinimum(int min[]) {
		int minimum=min[0];
		for(int i:min) {
			if(minimum>i) {
				minimum=i;
			}
		}
		return minimum;
	}
	//method to get maximum of array numbers
	public int getMaximum(int max[]) {
		int maximum=max[0];
		for(int i:max) {
			if(maximum<i) {
				maximum=i;
			}
		}
		return maximum;
	}
	//method to return the array
	public int[] getArray() {
		return new int[] {10,120,20,12,77};
	}
	public static void main(String[] args) {
		Arrays arr=new Arrays();
		//Initializing and instantiating the arrays
		int a[]=new int[5];
		String b[]=new String[4];
		//inserting data to the array a
		a[0]=21;
		a[1]=11;
		a[2]=23;
		a[3]=63;
		a[4]=12;
		//inserting data to the array b
		b[0]="Hello";
		b[1]="Reddy";
		b[2]="Poonam";
		b[3]="Aditya";
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(String i:b) {
			System.out.println(i);
		}
		//transversing return arraymmethod
		//int retrunArray[]=arr.getArray();
		for(int i:arr.getArray()) {
			System.out.println(i);
		}
		System.out.println("small number of the array"+" "+arr.getMinimum(a));
		System.out.println("largest number of the arry"+" "+arr.getMaximum(a));
	}

}
