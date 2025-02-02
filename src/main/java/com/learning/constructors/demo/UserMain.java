package com.learning.constructors.demo;

public class UserMain {

    public static void main(String[] args) {

        System.out.println("------- Default Constructor (provided by compiler) -------");

        // Even we have not provided any constructor still we are able to create the object with default values
        // Compiler implicitly provides default parameterless constructor
        User u = new User();
        System.out.println("User Name: " + u.name); // null
        System.out.println("User Birth Year: " + u.birthYear); // 0

        System.out.println("------- Default Constructor (provided manually) -------");
        // Here we have explicitly provided the no-argument default constructor or nullary constructor
        // This is different from compiler constructor
        // Because we can initialize object with some values instead of default values in no argument constructor
        // As soon as we provided our own constructor Compiler don't provide implicitly default parameterless constructor
        User2 u2 = new User2();
        System.out.println("User2 Name: " + u2.name); // Temp User
        System.out.println("User2 Birth Year: " + u2.birthYear); // 2000


        System.out.println("------- Parameterized Constructor (provided manually) -------");
        // As soon as we provided our own constructor Compiler don't provide implicitly default parameterless constructor
        // So here User3 don't want us to create object with default values
        // User3 class have only one constructor i.e parameterised constructor
        // User3 u3 = new User3(); // Error: Expected 2 arguments but found 0
        User3 u3 = new User3("Akshay", 1995);
        System.out.println("User3 Name: " + u3.name); // Akshay
        System.out.println("User3 Birth Year: " + u3.birthYear); // 1995

        System.out.println("------- Default & Parameterized Constructor (provided manually) -------");
        // As soon as we provided our own constructor Compiler don't provide implicitly default parameterless constructor
        // But we can have our own default and parameterized constructor both if we need
        User4 u5 = new User4();
        System.out.println("User4 Default Name: " + u5.name); // null
        System.out.println("User4 Default Birth Year: " + u5.birthYear); // 0

        User4 u4 = new User4("Nirav", 2002);
        System.out.println("User4 Parameterized Name: " + u4.name); // Nirav
        System.out.println("User4 Parameterized Year: " + u4.birthYear); // 2002


    }
}
