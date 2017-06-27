package com.stok

/**
* Created by stok on 21.6.2017.
*/

data class Person(val name: String, var age: Int)

class DemoB {

    var firstName: String = ""

    companion object {  // companion objects is similar to Java static
        @JvmStatic  fun main(args : Array<String>) {
            println("Hello, world!")
            val a = DemoA()         // val - readonly variable, similar to final in java
            var b = a.what()        // var - normal vairable
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

    fun sum(a: Int, b: Int): Int = a + b

    fun parse(s: String): Int? {
       //try {
       //    s.toInt()
       //} catch (Number)
    return null

    }
  }

