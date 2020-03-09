/**
 * 
 */
package com.org.sorting;

/**
 * @author Niraj
 *
 */
public class SelectionSorting {

	public static int[] selectionSort(int[] arr) {

		int temp, index = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp;

		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { -1, -3, 0, 2, 9, 5, 21, -89 };
		arr = selectionSort(arr);
		for (Integer i : arr)
			System.out.print(i + " ");

	}

}
