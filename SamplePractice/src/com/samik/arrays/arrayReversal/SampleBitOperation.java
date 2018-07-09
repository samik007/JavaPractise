package com.samik.arrays.arrayReversal;

public class SampleBitOperation {
	public static void main(String[] args) {
		int x=25;
		System.out.println(isPower(x));
	}
	public static boolean isPower(int x) {
		return ((x != 0) && ((x & (x - 1)) == 0))?true:false;
	}
}
