package com.org.sorting;

public class BubbleSorting {

	public static int[] bubbleSort(int[] arr) {
		int len = arr.length;
		boolean isSwap = true;
		for (int i = 0; i < len - 1; i++) {
			isSwap = false;
			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwap = true;
				}

			}
			if (!isSwap) {
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { -1, -3, 0, 2, 9, 5, 21, -89 };
		arr = bubbleSort(arr);
		for (Integer i : arr)
			System.out.print(i + " ");

	}

}
