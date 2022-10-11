import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int rem;
    int rev=0;
    int t=n;
    
    while(t!=0)
    {
        rem=t%10;
        rev=rev*10+rem;
        t=t/10;
    }
    if(n==rev)
    {
        System.out.println(" palindrome no");
    }else{
        System.out.println("Not a palindrome no");
    }

}
    }