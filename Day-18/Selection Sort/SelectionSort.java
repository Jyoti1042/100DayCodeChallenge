The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
from the unsorted part and putting it at the beginning.
  The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.
The subarray is already sorted.
And the second subarray is unsorted.
With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.

//Test Case:
Input Array:{1,4,6,3,5,7}
output:
sorted array is-
{1,3,4,5,6,7}

//Time Complexity
   Best: ?(n^2)
   Average: ?(n^2)
   Worst: O(n^2)
//Space Complexity:
   O(1)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public InsertionSort {
    public static void main(String[] args) {
        int[] a={5,1,6,2,4,3};
        int temp,j;
        for(int i=1;i<a.length;i++)
        {         temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
         }System.out.println("Sorted array is-");
         for(int i=0;i<a.length;i++)
         {
            System.out.print(a[i]+" ");
         }
    }
}
