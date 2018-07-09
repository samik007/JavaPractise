package com.samik.arrays.arrayReversal;

public class RotateByOne {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		for(int i=0; i<2;i++) {
			int temp = a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j] = a[j+1];				
			}
			a[a.length-1] = temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
