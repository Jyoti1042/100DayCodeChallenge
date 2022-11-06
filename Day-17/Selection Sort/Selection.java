\\The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from
the unsorted part and putting it at the beginning.
  The algorithm maintains two subarrays in a given array.
\\The subarray which already sorted. 
\\The remaining subarray was unsorted.
  Test Case 1:
Input:
int[] a={38,52,9,18,6,62,13}
Output:
int[] a={6,9,13,18,38,52,62}
Test Case 2:
Input:
int[] a={12,34,90,11,5,7,14}
Output:
int [] a={5,7,11,12,14,34,90}
........................................................................................................................................................................

  public class SelectionSort {
    public static void main(String[] args) {
        int[] a={38,52,9,18,6,62,13};
        int min,temp=0;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }System.out.println("Sorted list is");
        for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]+"");
    }
    }
}
