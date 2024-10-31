Getting Started
To get started with this repository, you'll need to have Java Development Kit (JDK) installed on your machine. The code examples provided are compatible with Java 8 and above.

Prerequisites
Java JDK 8+
Git (to clone the repository)
An IDE or text editor (e.g., IntelliJ IDEA, VS Code)
Installation
Clone this repository:

bash
Copy code
git clone https://github.com/pasinduimalsha/OODP.git
Navigate to the project directory:

bash
Copy code
cd OODP
Usage
Each pattern is implemented in its own directory with relevant classes and examples. You can explore each folder, open the code files, and compile and run them to see the pattern in action.

To run an example, follow these steps:

Navigate to the folder of the design pattern you want to run:

bash
Copy code
cd SingletonPattern
Compile the Java files:

bash
Copy code
javac SingletonExample.java
Run the main class:

bash
Copy code
java SingletonExample
Replace SingletonExample with the main class name of the pattern you're interested in.

Design Patterns
1. Abstract Factory Pattern
Folder: AbstractFactory
Description: The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
Example: VehicleFactory can create different types of vehicles, such as cars and trucks, without specifying the concrete type.
2. Observer Pattern
Folder: ObserverPattern
Description: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
Example: A news feed system where subscribers get notified when new articles are published.
3. Singleton Pattern
Folder: SingletonPattern
Description: The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.
Example: A serial number generator in manufacturing, ensuring unique serial numbers for each product.
4. Strategy Design Pattern
Folder: StrategyDesignPattern
Description: The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm to vary independently from clients that use it.
Example: Different sorting algorithms (e.g., bubble sort, quicksort) can be swapped based on performance requirements.
5. Template Design Pattern
Folder: TemplateDesignpattern
Description: The Template Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This lets subclasses redefine certain steps without changing the algorithm's structure.
Example: A cooking recipe where specific steps (like seasoning) can be overridden while maintaining the core structure of the cooking process.
6. Adapter Pattern
Folder: adapter
Description: The Adapter Pattern converts the interface of a class into another interface that clients expect, allowing incompatible interfaces to work together.
Example: An adapter between a legacy printing interface and a new one, allowing old systems to communicate with modern printers.
7. Factory Pattern
Folder: factory_pattern
Description: The Factory Pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
Example: A vehicle factory that can create different types of vehicles like bikes, cars, and trucks without changing the client code.
8. MVC (Model-View-Controller)
Folder: mvc
Description: The MVC Pattern separates an application into three interconnected components: Model (data), View (UI), and Controller (business logic). This promotes organized code, easier maintenance, and separation of concerns.
Example: An online store where the Model represents products, the View displays the product list, and the Controller handles the shopping cart logic.
