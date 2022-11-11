Description:
Heap sort is a comparison-based sorting technique based on Binary Heap data structure. 
It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning.
Repeat the same process for the remaining element.

##Heapsort is mainly used in hybrid algorithms like the IntroSort.
Sort a nearly sorted (or K sorted) array 
k largest(or smallest) elements in an array 

##Time Complexity: O(N log N)
  
##Test case1:
Input:
enter number of terms:5
  enter trems:{12,56,23,78,47}
output:
Sorted array is:{12,23,47,56,78}
##Test Case2:
input:
Enter number of terms:4
  enter terms:{11,34,6,2}
sorted array is:{2,6,11,34}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.Scanner;

class HeapSort {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);

		System.out.println("Enter no of terms");
		int n = sc.nextInt();

		System.out.println("Enter the terms");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("The unsorted array is:");
		System.out.println(Arrays.toString(arr));

		heap(arr);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void heapify(int a[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n)
			if (a[child] > a[max])
				max = child;
		if (child + 1 < n)
			if (a[child + 1] > a[max])
				max = child + 1;
		if (max != i) {
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			heapify(a, n, max);
		}
	}

	static void buildheap(int a[]) {
		for (int i = a.length / 2 - 1; i >= 0; i--)
			heapify(a, a.length, i);
	}

	static void heap(int a[]) {
		buildheap(a);
		for (int i = a.length - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, i, 0);
		}
	}
}
