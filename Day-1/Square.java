import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("Enter side of square");
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double area=side*side;
        double perimeter=4*side;
        System.out.println("area of square is "+area);
        System.out.println("perimeter of square is "+perimeter);
    }
}
