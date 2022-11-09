
##Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

##The new class that is created is known as subclass (child or derived class)
  and the existing class from where the child class is derived is known as superclass (parent or base class).
##The extends keyword is used to perform inheritance in Java.
###Output:
I like food 
I like sleeping.
 ## In the above example, the eat() method is present in both the superclass Animal and the subclass Dog.
  Here, we have created an object labrador of Dog.
Now when we call eat() using the object labrador,
the method inside Dog is called. This is because the method inside the derived class overrides the method inside the base class.
This is called method overriding. 
....................................................................................................................................................................  
  
   public class Animal {
      // method in the superclass
  public void eat() {
    System.out.println("I can eat");
  }
}

// Dog inherits Animal
class Dog extends Animal {

  // overriding the eat() method
  @Override
  public void eat() {
    System.out.println("I eat food");
  }

  // new method in subclass
  public void bark() {
    System.out.println("I like sleeping");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}
