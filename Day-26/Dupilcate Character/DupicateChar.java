Topic:Find all dupicate elements in a given string.
  By using replaceAll() funcation ,we replace all the spaces by null.
Test Case:
Enter String:
There is no god
Thereisnogod
e
o
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class DuplicateChar {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String s=sc.nextLine();
    s=s.replaceAll("\\s","");
    System.out.println(s);
    char[] ch=s.toCharArray();
     for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<s.length();j++)
        {
           if(ch[i]==ch[j])
           {
            System.out.println(ch[j]);
          break;
           }      
        
        }
  }
   }
  }  
