package com.qa.ArraysConcept;

public class TwoDimentionalArrays {
	public void cloningArray(int a[][]) {
		int b[][]=a.clone();
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		int a[][]=new int[][]{{10,20,12},{12,11,10},{32,12}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		TwoDimentionalArrays TD=new TwoDimentionalArrays();
		TD.cloningArray(a);
		
	}

}
