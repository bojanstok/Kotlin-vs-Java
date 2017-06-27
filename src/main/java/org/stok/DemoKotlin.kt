package org.stok


/**
  * The Person data class. We have an immutable field name, and a mutable field age.
 *  Kotlin automatically create constructor and the following methods: equals(), hashCode(), toString(), copy(), componentN() function
  */
data class Person(val name: String, var age: Int)


/**
 * The DemoKotlin class is written in Kotlin. The class demonstrate Kotlin features.
 *
 * Created by stok on 21.6.2017.
 */

class DemoKotlin {

    var firstName: String = ""   // mutable field firstName in class DemoB

    companion object {  // companion objects is similar to Java static
        @JvmStatic  fun main(args : Array<String>) {  // instead of [] we are using Kotlin class Array
            println("Hello Kotlin!")

            // creating instance of Java class. In Kotlin we not use keywork new. Everything is an object.
            val a = DemoJava()         // val - readonly variable, similar to final in Java. We cannot reassign the variable a

            // calling Java method what
            var b = a.isJavaFun()        // var - normal vairable
            println("Calling boolean java function: $b")

            // creating instance of Kotlin Class
            var k = DemoKotlin()
            k.demoDataClass()
            val result = k.sum(2,3)
            println("sum(2,3) = $result")

        }
    }

    fun demoDataClass() {
        val o1 = Person("John", 20) // Kotlin not use keyword new
        val o2 = Person("Bill", 33)
        o2.age = 40
        println ("$o1 $o2")  // Kotlin generate toString method for the Person data class
    }


    fun sum(a: Int, b: Int): Int = a + b     // inline function


  }

