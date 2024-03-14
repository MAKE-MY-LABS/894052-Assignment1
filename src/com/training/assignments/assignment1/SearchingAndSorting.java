package com.training.assignments.assignment1;

import java.util.Arrays;

public class SearchingAndSorting {

	public static void main(String[] args) {
		// call below functions and use them properly
		int[] arr = {5, 2, 8, 1, 9, 3};
		int target = 8;

		int linearSearchIndex = linearSearch(arr, target);
		System.out.println("Linear Search: Index of target " + target + " is " + linearSearchIndex);

		int binarySearchIndex = binarySearch(arr, target);
		System.out.println("Binary Search: Index of target " + target + " is " + binarySearchIndex);

		bubbleSort(arr);
		System.out.println("Bubble Sort: Sorted array is " + Arrays.toString(arr));

		selectionSort(arr);
		System.out.println("Selection Sort: Sorted array is " + Arrays.toString(arr));

		insertionSort(arr);
		System.out.println("Insertion Sort: Sorted array is " + Arrays.toString(arr));

	}

	/* give all teh searching and sortings methods below */
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return -1;
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
		}
	}


}
