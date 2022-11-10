##Quicksort is the widely used sorting algorithm that makes n log n comparisons in average case for sorting an array of n elements.
  It is a faster and highly efficient sorting algorithm. This algorithm follows the divide and conquer approach.
## Divide and conquer is a technique of breaking down the algorithms into subproblems, then solving the subproblems, 
and combining the results back together to solve the original problem.
 @@ Divide: In Divide, first pick a pivot element. After that, partition or rearrange the array into two sub-arrays
  such that each element in the left sub-array is less than or equal to the pivot element and each element in the right sub-array is larger than the pivot element.
 @@ Conquer: Recursively, sort two subarrays with Quicksort.
   
  ###Complexities::--
##Best Case Complexity - In Quicksort, the best-case occurs when the pivot element is the middle element or near to the middle element. 
   The best-case time complexity of quicksort is O(n*logn).
##Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending.
   The average case time complexity of quicksort is O(n*logn).
##Worst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest or smallest element. Suppose, 
    if the pivot element is always the last element of the array, the worst case would occur when the given array is sorted already in ascending or descending order. 
  The worst-case time complexity of quicksort is O(n2).

Test case1:
##Enter number of terms:5
Enter terms:{1,6,9,4,3}
Sorted array is:{1,3,4,6,9}
Test Case2:
Enter number of terms:8
Enter terms:{12,23,11,9,45,78,34,56}
Sortd array is:{9,11,12,23,34,45,56,78}

........................................................................................................................................................................

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
   
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
    
            sort(arr, 0, arr.length - 1);
    
            System.out.println("The sorted array is:");
            System.out.println(Arrays.toString(arr));
        }
    
        static void sort(int arr[], int start, int end) {
            if (start < end) {
                int pIndex = partition(arr, start, end);
                sort(arr, start, pIndex - 1);
                sort(arr, pIndex + 1, end);
            }
        }
    
        static int partition(int arr[], int start, int end) {
            int pivot = arr[end];
            int pIndex = start;
            for (int i = start; i < end; i++) {
                if (arr[i] <= pivot) {
                    swap(arr, i, pIndex);
                    pIndex++;
                }
            }
            swap(arr, pIndex, end);
            return pIndex;
        }
    
        static void swap(int arr[], int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
     

