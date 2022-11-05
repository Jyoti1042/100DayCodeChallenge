//Test case 1:
Input:
Enter decimal number:24
Output:11000

//Test Case 2:
Input:
Enter decimal number:56
Output:111000
................................................................................................................................................................
    
import java.util.Scanner;
public class DecimalIntoBinary {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[20];
        int index=0;
        if(num==0)
        {
            System.out.println(0);
        }
        while(num>0)
        {
            arr[index]=num%2;
            index++;
            num=num/2;
            
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }
}
