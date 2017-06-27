package org.stok


/**
  * The Person in data class. We have an immutable field name, and a mutable field age.
 *  Kotlin automatically create constructor and the following methods: equals(), hashCode(), toString(), copy(), componentN() function
  */
data class Person(val name: String, var age: Int)


/**
 * The DemoB class is written in Kotlin. The class demonstrate Kotlin features.
 *
 * Created by stok on 21.6.2017.
 */

class DemoB {

    var firstName: String = ""   // mutable field firstName in class DemoB

    companion object {  // companion objects is similar to Java static
        @JvmStatic  fun main(args : Array<String>) {  // instead of [] we are using Kotlin class Array
            println("Hello, world!")

            // creating instance of Java class. In Kotlin we not use keywork new. Everything is an object.
            val a = DemoA()         // val - readonly variable, similar to final in java. We cannot reassign the variable a

            // calling Java method what
            var b = a.what()        // var - normal vairable

            // creating instance of Kotlin Class
            var kotlinB = DemoB()
            b = true
            println (b)
            kotlinB.demoDataClass()

        }
    }

    fun demoDataClass() {
        val o1 = Person("John", 20)
        val o2 = Person("Bill", 33)
        o2.age = 40
        println ("$o1 $o2")
    }

    fun doit(): String {
        return "kkkk"
    }

    fun sum(a: Int, b: Int): Int = a + b     // inline function


  }

