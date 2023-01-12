#PROBLEM:COUNT TOTAL NUMBER OF WORDS IN A STRING.
#ALGORITHM------
Initialize count with 1 as if there are no spaces in the string, then there will be one word in the String.
Check if you encounter any space.
Once you find the space, check it next character. If it is not space then we found a word in the String.Increment the count variable.
Once you reach end of String, count variable will hold number of words in the String.

..........................................................................................................................................................................
import java.util.Scanner;
public class TotalWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) ==' ') 
            {
                count++;
            }
        }System.out.println("total words are" + count);
    }
}
