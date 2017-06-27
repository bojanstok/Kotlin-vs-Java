package org.stok;

/**
 * The DemoJava class is written in Java. The class calls method from class DemoB which is written in Kotlin.
 * <p>
 * Created by stok on 21.6.2017.
 */
public class DemoJava {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        DemoKotlin k = new DemoKotlin();
        System.out.println(k.sum(2, 4));

        // Creating instance of Kotlin data class. Usage is the same as it is normal Java class
        Person p = new Person("Joe", 20);
        String name = p.component1();    // using generated getter for the first field
        String name2 = p.getName();      // using generated getter for the name field
        Integer age = p.component2();    // using generated getter for the second field
        Integer age2 = p.getAge();       // using generated getter for the age field
        p.setAge(30);                    // the field age is mutable
        //p.setName("not exist")         the name field is immutable, so the setter setName(n) does not exist
        System.out.println(p);           // prints out: Person(name=Joe, age=30)

        Pojo pj = new Pojo(1, "a", "b");
        System.out.println(pj.toString());

        Pojo p2 = new Pojo(2); // using secondary constructor
        System.out.println(p2.toString()); // prints out:  Pojo(id: 2 name: defaultName desc: defaultDesc)


    }

    public Boolean isJavaFun() {
        return true;
    }

    /**
     * If a Java method returns void, it will return Unit when called from Kotlin.
     * If, by any chance, someone uses that return value, it will be assigned at the call site by
     * the Kotlin compiler, since the value itself is known in advance (being Unit).
     */
    public void makeOlder(Person p) {
        p.setAge(p.getAge() + 3);
    }
}

