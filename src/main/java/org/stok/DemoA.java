package org.stok;

/**
 * The DemoA class is written in Java. The class calls method from class DemoB which is written in Kotlin.
 *
 * Created by stok on 21.6.2017.
 */
public class DemoA {

    public static void main(String[] args) {
        System.out.println("helloA");
        DemoB b = new DemoB();
        System.out.println("res: " + b.doit());
        System.out.println(b.sum(2, 4));

        // Creating instance of Kotlin data class. Usage is the same as it is normal Java class
        Person p = new Person("Joe", 20);
        String name = p.component1();    // automatically generated getter for the first field
        String name2 = p.getName();      // automatically generated getter for the name field
        Integer age = p.component2();    // automatically generated getter for the second field
        Integer age2 = p.getAge();       // automatically generated getter for the age field
        p.setAge(30);                    // the field age is mutable
        //p.setName("not exist")         the name field is immutable, so the setter does not exist
        System.out.println(p);          // prints out: Person(name=Joe, age=30)
    }

    public Boolean what() {
        return true;
    }
}

