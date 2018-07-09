package com.samik.arrays.arrayReversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inversions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(s.nextLine());

		List<int[][]> list = new ArrayList<>();
		for(int i=0;i<noOfInputs;i++) {
			int N = Integer.parseInt(s.nextLine());
			int a[][] = new int[N][N];
			
			for(int j=0;j<N;j++) {
				String lines = s.nextLine();
				String[] strs = lines.trim().split("\\s+");
				for(int k=0;k<N;k++) {
					a[j][k]= Integer.parseInt(strs[k]);
				}
			}
			
			list.add(a);
		}
		for(int index=0;index<list.size();index++) {
			int a[][] = list.get(index);
			int n = a.length;
			
			int count=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int k=i;k<n;k++) {
						for(int m=j;m<n;m++) {
							if(a[i][j]>a[k][m]) {
								//System.out.println(a[i][j]+ " " + a[k][m]);
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
