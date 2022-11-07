###Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
   The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
##Worst Case Complexity: O(n2)
Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case complexity occurs.
Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.
  Thus, the total number of comparisons = n*(n-1) ~ n2
##Best Case Complexity: O(n)
  When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all. So, there are only n number of comparisons. Thus, complexity is linear.
##Average Case Complexity: O(n2)
  It occurs when the elements of an array are in jumbled order (neither ascending nor descending).
###Space Complexity
Space complexity is O(1) because an extra variable key is used.
  ###TestCase:
input array={7,5,4,2,3,6,1}
output:
Sorted Array:
{1,2,3,4,5,6,7}
###TestCase:
input array={34,56,23,12,57}
output:
sorted array:
{12,23,34,56,57}  
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
