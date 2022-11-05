\\DEFINITION:
Binary is the simplest kind of number system that uses only two digits of 0 and 1 (i.e. value of base 2).
  \\STEPS FOR CONVERTING BINARY INTO DECIMAL:
       Step-1: Write down the binary number.

        Step-2: Multiply each bit of the binary number with 2 raised to power (n-1) Calculate the value of each such multiplication.

        Step-3: Add the values of each multiplication result calculated in step-2.
                  The result, thus, obtained is the decimal number corresponding to the integer part of the binary
\\Test Case 1:
Input:Enter Binary Number
11001
Output:
25
  \\Test Case 2:
Input:Enter binary number
11000
Output:
24.
........................................................................................................................................................................
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
