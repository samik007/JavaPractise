package com.samik.arrays.arrayReversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveFriends {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(s.nextLine());

		List<int[]> list = new ArrayList<>();
		for(int i=0;i<noOfInputs;i++) {
			String lines = s.nextLine();
			String[] strs = lines.trim().split("\\s+");
			int n = Integer.parseInt(strs[0]);
			int k = Integer.parseInt(strs[1]);

			int[] array = new int[n+2];
			lines = s.nextLine();
			strs = lines.trim().split("\\s+");
			for (int j = 0; j < n; j++) {
				array[j] = Integer.parseInt(strs[j]);
			}
			array[n]=n;
			array[n+1]=k;
			list.add(array);
		}

		for(int i=0;i<list.size();i++) {
			remove(list.get(i));
		}
	}
	public static void remove(int array[]) {
		int n = array[array.length-2];
		int k = array[n+1];
		int[] friend = new int[n];
		for(int i=0;i<n;i++) {
			friend[i] = array[i];
		}
		int loc=0;
		boolean  DeleteFriend=false;
		int flag = k;
		while(flag>0) {
			for(int i=0; i<n-1; i++) {
				if(friend[i] < friend[i+1]) {
					loc = i;
					DeleteFriend = true;
					break;
				}
			}
			if(!DeleteFriend) {
				loc = n-1;
			}
			for(int i=loc+1;i<n;i++) {
				friend[i-1] = friend[i];
			}
			flag--;
		}
		for(int i=0;i<friend.length-k;i++) {
			System.out.print(friend[i] + " ");
		}
		System.out.println();
	}
}
