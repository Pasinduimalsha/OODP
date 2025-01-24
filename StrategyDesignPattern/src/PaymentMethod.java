public interface PaymentMethod {
   public abstract void pay(int amount);

}

//What do you know about the Interfaces

//1. Abstract Method - do not have a body
//2.Multiple Inheritance - Java doesn't support multiple inheritance of classes
// / Java allows a class to implement multiple interfaces
// / which is a way to achieve multiple inheritance
//3.Default Methods -  default methods, which are methods with a body
//4.functional interfaces -  which are interfaces with exactly one abstract method. These can be used with lambda expressions
