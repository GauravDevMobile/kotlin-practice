package com.gaurav.kotlinpractice


fun main() {
    var a = "gaurav is here"
//lamdaAndHigherOrder()
  //  simpleArray()

    //companionObject()
  //  varArgsAndFunction()
//    workingWithSets()
    //  workingWithMaps()
    // filtersAndMapping()
    // loops()
//lamdaExpressions()
//genericFunctions()
//    nullAndSmartcast()
//ifWhenChallenge()
//operatorOverloading()
//listAndMutableList()
//removedulicatesFromList()
//classesAndObject()
    // lamddaFunctions()
//fizzbuzzPractice()
    //  myfunctions()
    var age = 25;

    //switch case or when
    val ageGroup = when (age) {
        in 0..12 -> "Child"
        in 13..18 -> "Teen"
        in 19..40 -> "Adult"
        in 40..80 -> "Old"
        else -> "i don't know"
    }

    var data = if (10 > 20) {
        "false"
    } else {
        "true"
    }

    var data2 = 20 > 10
    //   print("you are right $data2")

    //we can use ternary quotes to print as it is
    var b = """
        
        
        Hello 
        gaurav     dfsfsf
        singh 
        
    """

    //we can use print each item
//    for (s in a) {
//        print(s + "..")
//    }
//
//    print("My group is $ageGroup")
//    print(ternaryOperator())

}

fun simpleArray() {
    //we can only change these vales
   var array=Array<Int>(4){1}
    for(i in array)
    {
        println(i)
    }
}

fun lamdaAndHigherOrder() {

  //  var multiply:(Int,Int)->Unit={a,b-> println(a*b)} //lamda expression
    performAction({a,b-> println(a*b)} )
}
fun performAction(myLamda:(Int,Int)->Unit)
{
    myLamda(4,8)

}



fun varArgsAndFunction() {
 var v= intArrayOf(45,54,45,55)
    multiplyAll(10,45,*v)
 //   multiplyAll(10,45,2,2,2,2)
}

fun multiplyAll(a:Int,b:Int,vararg c:Int)
{
    print(a*b)
}


fun companionObject() {
    val b1 = Bosco()
    val b2 = Bosco()
    val b22 = Bosco.a;
    println(b22)

}

class Bosco {
    init {
        a++;
    }

    companion object {
        var a = 0;
    }
}

fun lamdaExpressions() {
    val company = listOf("developers", "designers", "Seo", "Hrr", "ProjectManager")
    print("largest text ${company.filter { it.length > 4 }}")
    print("mapping data ${company.map { it + " in ppc" }}")
    print("max name data ${company.maxBy { it.length }}")
    print("min name data ${company.minBy { it.length }}")
}

fun operatorOverloading() {

    var a = TestOVerload(10, 45)
    var b = TestOVerload(78, 58)
    println("sum is ${a + b}")
    println("difference is ${a - b}")
}

data class TestOVerload(var a: Int, var b: Int) {

    operator fun plus(next: TestOVerload): TestOVerload {
        return TestOVerload(a + next.a, b + next.b)
    }

    operator fun minus(next: TestOVerload): TestOVerload {
        return TestOVerload(a - next.a, b - next.b)
    }


}

fun genericFunctions() {
    val minInt = getSmaller(42, 99)
    val minDouble = getSmaller(9.887, 3.14159)
    val minString = getSmaller("kitten", "kittens")

    print("smaller int $minInt")
    print("smaller double $minDouble")
    print("smaller string $minString")
}

fun <T : Comparable<T>> getSmaller(value1: T, value2: T): T {
    val result = value1.compareTo(value2)
    return if (result < 0) value1 else value2
}

fun classesAndObject() {

    var dev = Developer("Gaurav", "Singh", 50_000)
    var s = dev.ctc
}

@Deprecated("this class is deprecated", ReplaceWith("Programmer"))
class Developer(name: String, salary: Int) {
    init {
        println("$name has $salary salary")
    }

    constructor(firstName: String, lastName: String, salary: Int) : this(firstName, salary)

    var ctc = object {
        var grossSalary = salary;
        var tax = 300;
        fun sum() {
            println("CTC is ${grossSalary + tax}")
        }
    }
}


fun fizzbuzzPractice() {
    for (i in 1..105) {
        when {
            (i % 15 == 0) -> println("no $i is FizzBuzz")
            i % 3 == 0 -> println("no. $i is Fizz")
            i % 5 == 0 -> println("no. $i is Buzz")


        }
    }
}

fun myfunctions() {
    print(sum(num2 = 100))
}

fun sum(num1: Int = 45, num2: Int) = num1 + num2

fun lamddaFunctions() {
    var add = { a: Int, b: Int ->
        a + b

    }


    println(add(10, 520))
}

fun removedulicatesFromList() {
    val animals = listOf("squirrel", "elephant", "zebra", "zebra", "cat", "cat")


    print("${animals.toSet()}")
}

fun filtersAndMapping() {
    val list = listOf(10, 20, 40)
    val set = setOf(45, 14, 45, 65)
    val map = mapOf(1 to "gaurav", 2 to "singh")

    println("sorted list ${list.filter { it > 20 }}")
    println("sorted set ${set.filter { it < 50 }}")
    println("change list data ${list.map { it + 50 }}")
    println("compare 50 data ${list.last { it < 30 }}")
    println("change map data ${map.map { Pair(it.key, it.value + "-") }.toMap()}")

}

fun workingWithMaps() {
    val map = mapOf(
        1 to "gaurav",
        2 to "singh"
    )


    var mMap = mutableMapOf(
        1 to "soro",
        2 to "koro"
    )


    for (key in mMap.keys) {
        println(mMap[key])
    }
}

fun workingWithSets() {
    val set = setOf(18, 12, 12, 12, 14)//doesn't contains duplicate items
    val mSet = mutableSetOf(12, 12, 12, 14)
    mSet.remove(14)

    print(set)
    print("mset $mSet")

//difference?
    val hset = hashSetOf(15, 14, 10, 5, 44, 44)
    print(hset)
    hset.toList()
}

fun listAndMutableList() {
    var list = listOf(
        "gaurav",
        "singh",
        "karakoti"
    )//this list do not have add,remove etc. but we can create sublist
    var sublist = list.subList(1, 3)
    val mutableList = mutableListOf(12, 21, 4556, 4, 154)
    mutableList.add(100)
    mutableList.remove(12)
    print(sublist)
    println(mutableList)

}

fun ifWhenChallenge() {
    var cardpoints = 7_000

    val cardlevel = when (cardpoints) {
        in 0..999 -> "pearl"
        in 1000..5_000 -> "Silver"
        in 5_000..10_000 -> "Gold"
        else -> "Platinum"
    }

    when {
        cardpoints > 6000 -> print("greater than 6000")
    }


}

fun nullAndSmartcast() {
    var name: String? = null;
    var d = name ?: "lovkesh"
    print(d)
}

fun loops() {
    val names = listOf<String>("gaurav", "saurav", "Rajni")
    for (n in names) {
        println(n)
    }
    for (g in 1..10) {
        println(g)
    }

    for ((name, index) in 10.until(20).step(2).withIndex()) {
        println("$name   $index")
    }

}

fun ternaryOperator(): Int {
    return if (10 > 20) 10 else 20
}


class practice1 {
    val maxsalary: Int = 45;//declare most variable as val as best practice
    var n: Long = 45000000L; //variable change can increse complexity of program and testing issue
    var f: Float = 98.6f //32 bit
    var mInt = f.toInt() //converting float to int

    var longint = 45_5_65
    val c: Char = 'A'
    fun getchar() {

        var value1 = true
        var value2 = false
        if (value1 && value2) {

        }
        if (value1 || value2) {

        }


        print("This is value: $c ${c.equals('A')}")
    }


}