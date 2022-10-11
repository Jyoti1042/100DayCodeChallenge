import java.util.Scanner;
public class Hcf {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a");
    int a=sc.nextInt();
    System.out.println("enter b");
    int b=sc.nextInt();
    int gcd=1;
    System.out.println("factors of a is");     
    for(int i=1;i<a;i++)
    {
        if(a%i==0)
        {
            System.out.printf("%d ",i);
        }
    }
    System.out.println("");
    System.out.println("factors of b is");
    for(int i=1;i<b;i++)
    {
        if(b%i==0)
        {
            System.out.printf("%d ",i);
        }
    }System.out.println("");    
    for(int i=1;i<a &&i<b;i++)
    {
        if(a%i==0 &&b%i==0)
        {
          gcd=i;   
        }
    }System.out.printf("Gcd=%d",gcd);
      }
    }