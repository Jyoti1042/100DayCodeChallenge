import java.util.Scanner;
public class MixPattern {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
        System.out.print("*\n");
           for(int i=1;i<=n;i++)
           {
               System.out.print("*");
               for(int j=1;j<=i;j++)
               {
                   System.out.print(j);
               }
               for(int k=i-1;k>=1;k--)
               {
                   System.out.print(k);
               } System.out.print("*");
                 System.out.println("");
           }
                for(int i=n-1;i>=1;i--)
         {
                    System.out.print("*");
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                    for(int k=i-1;k>=1;k--)
                    {
                        System.out.print(k);
                    } System.out.print("*");
                       System.out.println("");
      }
           System.out.print("*");
       }}

