import java.util.Scanner;
public class P99 {
    public static void main(String[] args) {
        System.out.println("Enter N");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            { 
                System.out.print(" ");
            }int t=i;
           for(int k=1;k<=i;k++)
           { 
               System.out.print(t);
               t++;
           }t=t-2;
            for(int l=1;l<i;l++)
            { 
                System.out.print(t);
                t--;
                
            }
            System.out.println("");
        }
    }
     
}
	

