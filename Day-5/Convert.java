import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter Starting no");
        int s=sc.nextInt();
        System.out.println("enter ending no");
        int e=sc.nextInt();
        System.out.println("enter the gap no");
        int w=sc.nextInt();
        int f;
        System.out.println("...............................");
        while(s<=e)
        { 
            f=(5*(s-32))/9;
            System.out.println(s+" "+f);
            s=s+w;
        }}}
    