import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int rev=0;
        while(num!=0)
        {
            rem=num%10;

            rev=rev*10+rem;
            num=num/10;
            if(rem==0)
            {
                continue;}

        }System.out.println(rev);
    }
}
