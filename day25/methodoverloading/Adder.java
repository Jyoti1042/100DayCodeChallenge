//Definition :-If a class
//has multiple methods having same name but different in parameters, it is known as Method Overloading.

//If we have to perform only one operation, having same name of the methods increases the readability of the program
.

//Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.
  //Test case 1 :- 
   // Input :- 22
   // Output :-33


class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  
