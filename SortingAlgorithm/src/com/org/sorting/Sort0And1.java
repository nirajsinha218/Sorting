package com.org.sorting;

public class Sort0And1 {

	public static int[] sort(int arr[]) {
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			if (arr[l] == 1 && arr[r] == 0) {
				int temp = arr[l];
				arr[l++] = arr[r];
				arr[r--] = temp;
			}
			if (arr[l] == 0 && arr[r] == 1) {
				l++;
				r--;
			}
			if (arr[l] == 0 && arr[r] == 0) {
				l++;
			}
			if (arr[l] == 1 && arr[r] == 1) {
				l++;
				r--;
			}
			
			/*
			 if (arr[l] == 0) {
				l++;
			}
			if (arr[r] == 1) {
				r--;	
			}
			 */
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1,0,0,0};
		arr = sort(arr);
		for (int a : arr)
			System.out.print(a + " ");
	}

}
