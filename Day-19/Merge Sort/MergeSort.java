
###The Merge Sort algorithm is a sorting algorithm that is based on the Divide and Conquer paradigm.
  In this algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner.

###Time Complexity: O(N log(N)), 
Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation. 

T(n) = 2T(n/2) + θ(n)
 ### Test Case1:
Enter no of terms:5
Enter terms:{1,7,5,9,4}
Sorted array is={1,4,5,7,9}
###test case2:
Enter no of terms:6
Enter terms:{12,56,23,90,34,14}
sorted array is:{12,14,23,34,56,90}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------  

import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
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

		mergesort(arr);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void mergesort(int arr[]) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
 

