Assignment-3. ● Create a Java Bean Class Student. ● Add three attributes ○ private String name; ○ private int age; ○ private String department; ● Add a constructor that takes all three attributes as parameters. ● Add setter and getter methods ● C o m pile t h e p r o g r a m

package Encapsulation;

public class Student12 {
    private String name;
    private int age;
    private String department;
    public Student12(String name, int age, String department)
    {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Student12 student12 = new Student12("Munna_aziz",22,"BCA");
        System.out.println("Student Name: " + student12.getName());
        System.out.println("Student Age: " + student12.getAge());
        System.out.println("Student Department: " + student12.getDepartment());

    }
}

________________________________________________________________________________________________


Assignment-2. ● Write a Java program that demonstrates method overloading by creating a class called Calculator. ● Add three methods called add(). ● The first add() method should take two int variables as arguments and return their sum as int. ● The second add() method should take three int variables as arguments and return their sum as int. ● The third add() method should take two doubles as arguments and return their sum as double. ● The program should allow the user to display the results of each method. 



public class Calculator {
   public int  add(int a, int b)
   {

       return a+b;
   }
   public int  add(int c,int a, int b)
   {
       return a+b+c;
   }
   public double add(double a,double b)
   {
       return a+b;
   }

    public static void main(String[] args) {
        Calculator c = new Calculator();
      int value  = c.add(10,20);
      System.out.println(value);
      int value1 = c.add(15,30,45);
      System.out.println(value1);
      double value2 = c.add(9,12);
      System.out.println(value2);
    }

___________________________________________________________________________________________________4


Assignment-1. ● Write a Java program named Car ● The Car class should have the following attributes: make (String), model (String) , year (short) , and price(int) . ● The car class should have a constructor that takes all the attributes. ● Add a main method to instantiate car objects. ● The program should allow the user to create and display objects of each Car Class. 


package Encapsulation;

public class Car {
    private String make;
    private String model;
    private short year;
    private  int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void display()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {
        Car car = new Car("Suzuki","Win", (short) 2020,562222);
        car.display();

    }
}
Assignment-2. 

● Create a new class Employee 

● Add member variables: id and age of type int, name of type String and isPermanent of type boolean 

● Now assign values 35.5 to age; See the error message.

 ● How can you avoid this error? Correct the error by casting. 

● Make all the members protected 

● Add a main method to it. Print message “Successfully started”. 

● Compile the class.

package Encapsulation;

public class Employee {
   protected int id;
   protected int  age = (int) 35.5f;
   protected String name;

    public static void main(String[] args) {
        System.out.println("Successfully started");
    }

}
Assignment-1.

 ● Create a class Student in Student.java then add member variables studentName, collegeName of type String 

● Add a member variable studentID of type int. 

● Make all the member variables as private.

 ● Add a main method. And print a message “Successful”.

 ● Compile the class 

● Run the class (Follow Coding convention)


package Encapsulation;

public class St {
    private int StudentName;
    private int StudentID;
    private String collegeName;

    public static void main(String[] args) {
        System.out.println("Successful");


    }
}



}
