package com.samik.arrays.arrayReversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(s.nextLine());

		List<int[]> list = new ArrayList<>();
		for(int i=0;i<noOfInputs;i++) {
			String lines = s.nextLine();
			String[] strs = lines.trim().split("\\s+");
			int N = Integer.parseInt(strs[0]);
			int K = Integer.parseInt(strs[1]);

			int[] array = new int[N+2];
			lines = s.nextLine();
			strs = lines.trim().split("\\s+");
			for (int j = 0; j < strs.length; j++) {
				array[j] = Integer.parseInt(strs[j]);
			}
			array[array.length-2]=N;
			array[array.length-1]=K;
			list.add(array);				
		}

		for(int i=0;i<list.size();i++) {
			int a[] = list.get(i);
			int temp[] = new int[list.get(i).length-2];
			for(int j=0;j<temp.length;j++) {
				temp[j]=a[j];
			}
			leftRotate(temp, a[list.get(i).length-1]);	
			for(int j=0;j<temp.length;j++) {
				System.out.print(temp[j] + " ");
			}			
		}
	}
	public static void leftRotate(int a[], int d) {
		int n = a.length;
		reverseArray(a,0, n-d-1);
		reverseArray(a,n-d, n-1);
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
