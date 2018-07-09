package com.samik.arrays.arrayReversal;

public class JugglingAlgorithm {
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int n = a.length, d = 3, temp, j, k;
		for(int i=0;i<gcd(n,d); i++) {
			temp = a[i];
			j=i;
			while(true) {
				k=j+d;
				if(k >= n) k=k-n;
				if( k==i) break;
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}
		System.out.println(a);
	}
}
