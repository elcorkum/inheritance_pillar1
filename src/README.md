INHERITANCE


Objects as used in Java hold state and behavior
Inheritance is the concept of having one class become the subclass of another class and thus acquiring members of the class.
Inheritance eliminates the need for duplicating code that already exists in other classes.
Subclasses are a more specialized form of the superclass and they go in depth on the details that pertain to them specifically.
Below is a superclass:


```
package inheritance;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}```

```
Inheritance occurs when the Person class is extended by another class. They keyword *****extends***** establishes this
```
package inheritance;

public class Employee extends Person{
}
```
This Employee subclass inherits the methods and instance variables from the Person class
It can also have instance variables and methods of its own.
This eliminates the need to duplicate the fields within the superclass and the Employee class can focus on declaring variables that are specific to it.
```
package inheritance;

public class Employee extends Person{
    
    private String title;
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
}
```
An Employee IS-A Person hence this inheritance relationship passes the test.
Inheritance only works one way.
The Employee subclass inherits from the Person superclass but the Person superclass cannot inherit from the Employee class.


CONSTRUCTORS IN INHERITANCE
When we create an object of the subclass type, the superclass constructor is called first before the subclass constructor.
We can specify how the constructor in the subclass constructs objects but we always have to call the super() as the first line of code in our constructor
If the superclass has more than one constructor, we can specify which one we call by passing the matching type and number of arguments when we call super() in the subclass constructor.
This is an explicit call to the super() constructor



OVERRIDING AND OVERLOADING METHODS
Overriding of a method occurs when a subclass changes some of the functionality it inherited from the superclass.

Below is a class Rectangle
```
package shape;

public class Rectangle {
    private int sides = 4;
    private double length;
    private double width;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculatePerimeter() {
        return (this.length*2) + (this.width*2);
    }
}
```
A subclass square inherits from Rectangle as a square IS-A Rectangle;
```
package shape;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}```
```
We can see above that Square inherits the fields and the calculatePerimeter method.
It overrides this method because it calculates perimeter a different way.
It is important to note that the method signature stays the sames during overriding.
It is a good practice to use the @Override keyword at the top of the overriden method.
This ensures we are actually overriding the method. If we make an error on the method signature the compiler will complain and alert us of such error.


OVERLOADING a method is when two methods have the same name but different parameter lists.



ACCESS LIMITATIONS AND MULTIPLE INHERITANCE
Constructors are not inherited
Private and final methods and fields are inherited but cannot be overriden


Java classes can only inherit from one superclass. A superclass can also inherit from a superclass and thus creating a chain of inheritance.
The subclass inherits from higher classes in the chain through the class it immediately and directly inherits from.

Subclasses with the same superclass are not related to one another. They only have and individual relationship with the superclass.






