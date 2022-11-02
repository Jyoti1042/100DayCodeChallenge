import java.util.Scanner;
public class BinaryIntoDecimal {
    public static void main(String[] args) {
        System.out.println("enter binary number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int dec=0;
        int i=1;
        while(num!=0)
        {
            rem=num%10;
            dec=dec+rem*i;
            i=i*2;
            num=num/10;
        }System.out.println(dec);
    }
}
