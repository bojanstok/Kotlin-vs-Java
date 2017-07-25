package org.stok


/**
 * The Person data class. We have an immutable field name, and a mutable field age.
 *  Kotlin automatically create constructor and the following methods/functions:
 *  equals(), hashCode(), toString(), copy(), componentN() function
 */
data class Person(val name: String, var age: Int)


/**
 * The DemoKotlin class is written in Kotlin. The class demonstrate Kotlin features.
 *
 * Created by stok on 21.6.2017.
 */

class DemoKotlin {

    var firstName: String = ""   // mutable field firstName in class DemoKotlin

    companion object {  // companion objects is similar to Java static
        @JvmStatic fun main(args: Array<String>) {  // instead of [] we are using Kotlin class Array
            println("Hello Kotlin!")

            // creating instance of Java class. In Kotlin we not use keyword new. Everything is an object.
            val demoJava = DemoJava()         // val - readonly variable, similar to final in Java. We cannot reassign the variable a

            // calling Java method
            var b = demoJava.isJavaFun()        // var - normal variable
            println("Calling boolean java function: $b")

            // creating instance of Kotlin Class
            var k = DemoKotlin()
            k.demoDataClass()
            val result = k.sum(2, 3)
            println("sum(2,3) = $result")


        }
    }

    fun demoDataClass() {
        val p1 = Person("John", 20) // Kotlin not use keyword new
        val p2 = Person("Bill", 33)
        p2.age = 40

        val demoJava = DemoJava()
        // calling Java void functions, returns kotlin.Unit object
        val unit = demoJava.makeOlder(p1)


        println("p1: $p1  p2: $p2  void: $unit")  // Kotlin generate toString function/method for the Person data class


    }


    fun sum(a: Int, b: Int): Int = a + b     // inline function


}

