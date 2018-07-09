package com.samik.arrays.arrayReversal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ModuloBasedSorting {

	public static void main(String[] args) {
		int[] a = {12, 18, 17, 65, 46};
		int N=5, M=6;
		int[] moduloA = new int[N];
		int[] finalA = new int[N];
		for(int i=0;i<N;i++) {
			moduloA[i] = a[i]%M;
		}
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<N;i++) {
			hm.put(a[i], moduloA[i]);
		}
		Arrays.sort(moduloA);

		int index=0;
		for(int i=0;i<N;i++) {
			for(Map.Entry<Integer, Integer> map:hm.entrySet()) {
				int flag=0;
				if(moduloA[i] == map.getValue()) {
					for(int j=0;j<finalA.length;j++) {
						if(map.getKey() == finalA[j]) {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						finalA[index]=a[i];
						index++;
						break;
					}
				}
			}
		}
		for(int i=0;i<finalA.length;i++) {
			System.out.print(finalA[i] + " ");
		}
	}

}
