import java.util.Scanner;
public class Swap {  
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x");
    int x=sc.nextInt();
   System.out.println("enter y");
    int y=sc.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After swapping value of x is "+ x + " and y is " +y);
}}

