package com.samik.arrays.arrayReversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapIt {
	public static void main(String[] args) {
		int n=3, k=2;
		int[] main = {5, 3, 1};
		mainFunction(main, n, k);
	}
	
	public static int getElementIndex(int element, int[] a) {
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(a[i] == element) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public static int getMin(int[] finalArray) {
		int min=finalArray[0];
		for(int i=1;i<finalArray.length;i++) {
			if(finalArray[i] < min) {
				min=finalArray[i];
			}
		}
		return min;
	}
	
	public static void mainFunction(int[] main, int n, int k) {
		int[] sorta = new int[main.length];
		int[] a = new int[main.length];
		
		for(int i=0;i<n;i++) {
			sorta[i]=main[i];
			a[i]=main[i];			
		}
		
		Arrays.sort(sorta);
		List<int[]> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			for(int m=0;m<n;m++) {
				a[m]=main[m];			
			}
			k=3;
			int tmp[] = new int[n];
			for(int j=i;j<n;j++) {
				if(sorta[j] < main[0]) {
					int index = 1;
					while(k>0 && index >0) {
						index = getElementIndex(sorta[j], a);
						int temp = a[index-1];
						a[index-1]=a[index];
						a[index]=temp;
						k--;
					}
				}else {
					break;
				}
			}
			for(int m=0;m<n;m++) {
				tmp[m]=a[m];
			}
			list.add(tmp);
		}
		
		int[] minArray = new int[list.size()];
 		for(int i=0;i<list.size();i++) {
 			minArray[i] = list.get(i)[0];
		}
 		int min = getMin(minArray);
 		for(int i=0;i<list.size();i++) {
 			if(list.get(i)[0] == min) {
 				int[] result = list.get(i);
 				for(int j=0;j<result.length;j++) {
 					System.out.print(result[j] + " ");
 				}
 				break;
 			}
 		}
	}
}