package com.gaurav.kotlinpractice

import android.util.Log
import java.util.Locale.filter
import java.util.stream.Collectors.mapping
import kotlin.random.Random


fun main() {
    //arrays()
    //  reduceFunction()
    // chunkedFunction()
    // listfunctions()
    // take()
    //drop()
//mapping()
    // allPositiveNegative()
    //any()
    // groupby()
    /// filter()
    // slices()
    //maxBy()
    //basicoperations()
    //count()

    // foldreduce()

   var b= A {
       print(it.toString())
   }
    b.getdata()


    val  lambda:(Int,Int)->Unit={a:Int,b:Int->Unit}
   g(lambda)



}

fun g(k:(A:Int,b:Int)->Unit)
{

}

class A(val d:(Int)->Unit)
{

    fun getdata()
    {
        d.invoke(100)
    }

}


fun foldreduce() {
    val l = listOf(12, 18, 1)
    println(l.reduceRight() { a, b -> a - b })
}

fun count() {
    val list = listOf(553, 34, 5, 44, 11)
    println(list.count())
    println(list.count { it > 12 })
    println(list.count { it < 0 })
    println(list.count { it > 0 })
}

fun basicoperations() {
    val list = listOf(45, 12, 55)
    print(list.max())
    print(list.min())
    print(list.average())
    print(list.sum())
    print(list.reversed())

}

data class Employee(val designation: String, val salary: Int)

fun maxBy() {
    val list = listOf(
        Employee("Android developer", 30000),
        Employee("Seo", 20000), Employee("Backend", 30000)
    )

    print(list.maxBy { it -> it.salary })


}

fun slices() {
    val list = listOf(100, 100, 100, 40, 40, 40, 40, 20, 20, 10)
    print(list.slice(1..5))
}

fun filter() {
    val list = listOf(100, 100, 100, 40, 40, 40, 40, 20, 20, 10)

    print(list.filter { it > 50 })
    print(list.filterNot { it < 50 })
}

fun mapping() {
    val list = listOf(100, 100, 100, 40, 40, 40, 40, 20, 20, 10)
    print(list.map { it * 21 })
}

fun groupby() {
    val list = listOf(100, 100, 100, 40, 40, 40, 40, 20, 20, 10)
    var newList = list.groupBy {
        if (it == 100) {
            "king"
        } else {
            "queen"
        }
    }
    println(newList)
}

fun any() {
    val list = listOf(12, 21, 454, 44, 484, 25)
    //if any value is equal to 44 it will return true
    var result = list.any { it == 44 }
    print(result)
}

fun allPositiveNegative() {
    val list = mutableListOf(10, -10, 15, 46, -66)

    //return true if all numbers in list is negative
    print(list.all { it < 0 })

    //return true in all numbers in list is positive
    print(list.all { it > 0 })
}

fun drop() {
    val list = List(20) {
        it + 1;
    }

    println(list.dropLast(4))
    println(list.dropWhile { it < 10 })
    println(list.dropLastWhile { it > 10 })


}

fun take() {
    val list = List(50) {
        it + 1
    }
    println(list.toString())

    println(list.takeLast(4))

    //take values until condition is true
    println(list.takeWhile { it -> it < 40 }.sortedDescending())

    //take all the elements if it contains this particular number
    println(list.takeIf { it -> it.contains(4) })

}

fun listfunctions() {
    var list = List(40) {
        Random.nextInt()
    }
    list = list.filter { it -> it > 0 }
    list = list.sorted()
    list = list.map { it -> it % 3 }.map { l -> l * 10 }
    var set = list.toHashSet()
    set.forEach()
    {
        println(it)
    }
    var list2 = set.takeWhile { it -> it > 10 }

    list2.forEach()
    {
        println("$it   ........")
    }

    val mydata = listOf(12, 45, 69, 78, 41, 5225, 4, 5, 1, 45, 78, 452)


}

fun chunkedFunction() {
    //it will give us the chunks of a list by specifiying chunks size
    val list = mutableListOf(45, 55, 66, 88, 77, 45)
    val chunkedList = list.chunked(4)
    for (i in chunkedList) {
        println(i)
    }
}

fun arrays() {
    val list = IntArray(10) {
        10 * it
    }
    for (i in 10..15 step 2) {
        println(i)
    }
}

fun reduceFunction() {
    //addition and multiplication of multiplication
    val list = listOf(2, 85)
    with(list)
    {
        reduce { a, b -> a * b }

    }
    val result = list.reduce { a, b -> a * b }

    print(result)

}
