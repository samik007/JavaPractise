package com.samik.arrays.arrayReversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(s.nextLine());
		
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<noOfInputs;i++) {
			String lines = s.nextLine();
			String[] strs = lines.trim().split("\\s+");
			int[] array = new int[strs.length];
			for (int j = 0; j < strs.length; j++) {
				array[j] = Integer.parseInt(strs[j]);
			}
			list.add(array);
		}
		
		for(int i=0;i<list.size();i++) {
			gcdGame(list.get(i)[0], list.get(i)[1]);
		}
	}
	
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	static void gcdGame(int a, int c) {
		int A=1, C=0;
		boolean flag=true;
		if(a==1 || c==1) {
			flag=false;
		}
		while(flag) {
			if(A == 1) {
				int g = gcd(a,c);
				if(g==1) {
					c=c-1;
				}else {
					int t = c/ gcd(a,c);
					if(t<c-1) {
						c=t;
					}else {
						c--;
					}
				}
				A=0;
				C=1;
			}else if(C == 1){
				int g = gcd(a,c);
				if(g==1) {
					a=a-1;
				}else {
					int t = a/ gcd(a,c);
					if(t<a-1) {
						a=t;
					}else {
						a--;
					}
				}
				A=1;
				C=0;
			}
			if(a==1 || c==1) {
				break;
			}
		}
		if(a==1 && c==1) {
			System.out.println("Draw");
		}else if(c==1) {
			System.out.println("Arjit");
		}else if(a==1 ) {
			System.out.println("Chandu Don");
		}
	}
}
