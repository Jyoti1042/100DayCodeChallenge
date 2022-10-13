import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {     
      System.out.println("Enter a number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int length=0;
      int num1=n;
      while(num1!=0)
      {
        
        length=length+1;
        num1=num1/10;
      }
    int num2=n,rem,arm=0;
    while(num2!=0)
 {
    int mul=1;
    rem=num2%10;
    for(int i=1;i<=length;i++)
    {
    mul=mul*rem;
    }  
    arm=arm+mul;
    num2=num2/10;            
 }
     if(arm==n)
     {
        System.out.println(n +" is Armstrong");
     }else
     {
        System.out.println(n +" is not Armstrong");
     }
    }
}