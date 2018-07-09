package com.samik.arrays.arrayReversal;

import java.util.Scanner;

public class NiceString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		
		String[] array = new String[N];
		for(int i=0;i<N;i++) {
			String line = s.nextLine();
			array[i] = line;
		}
		
		for(int i=0;i<array.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if((int)array[j].charAt(0) < (int)array[i].charAt(0)) {
					count++;
				}
			}
			System.out.println(count);
		}	
	}
}
