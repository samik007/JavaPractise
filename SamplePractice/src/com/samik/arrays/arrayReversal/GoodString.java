package com.samik.arrays.arrayReversal;

import java.util.Scanner;

public class GoodString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
		
		String goodString="";
		int max=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || 
					(s.charAt(i) == 'i') || (s.charAt(i) == 'o') ||
						(s.charAt(i) == 'u')) {
				goodString = goodString + String.valueOf(s.charAt(i));
			}else {
				if(goodString.length() > 0) {
					if(goodString.length()>max) max = goodString.length();
					goodString="";
				}
			}
			if(i==s.length()-1) {
				if(goodString.length()>max) max = goodString.length();
				goodString="";
			}
		}
		System.out.println(max);
	}
}
