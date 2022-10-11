import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of elements in array");
   int n=sc.nextInt();
   int a[]=new int[n];
   int b[]=new int[n+1];
   System.out.println("Enter Values");
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   }
   System.out.println("Enter index of new value to be Inserted");
   int m=sc.nextInt();
   System.out.println("Enter new value to be inserted");
   int p=sc.nextInt();
   for(int i=0;i<n+1;i++)
{
    if(i<m)
    {
        b[i]=a[i];
    }
    else if(i==m)
    {
        b[i]=p;
    }
    else{
        b[i]=a[i-1];
    }
}   
    System.out.println("Elements are");
    for(int i=0;i<n+1;i++)
    { System.out.println(b[i]);}   
}}
