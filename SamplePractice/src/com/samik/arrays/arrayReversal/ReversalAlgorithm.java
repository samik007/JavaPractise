package com.samik.arrays.arrayReversal;

public class ReversalAlgorithm {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		leftRotate(a, 2);	
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void leftRotate(int a[], int d) {
		int n = a.length;
		reverseArray(a,0, d-1);
		reverseArray(a,d, n-1);
		reverseArray(a,0, n-1);
	}
	public static void reverseArray(int a[], int start, int end) {
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
