import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
    System.out.println("Enter number of elements");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter elements");
    int a[]=new int[n];
    int temp;
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
       int flag=0;
    for(int j=0;j<a.length-1-i;j++)
    {
        if(a[j]>a[j+1])
        {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            flag=1;
        }  
    }
    if(flag==0)
    {
        break;
    }
    }System.out.println("Sorted list is");
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]+" ");
    }
} 
}
