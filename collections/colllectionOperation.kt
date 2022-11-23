package collections

fun main(args: Array<String>) {

    var num1= mutableListOf<Int>(1,2,3,4,5,6)
    println(num1)
    println(num1.size)
    //atleast any value is divided by 2 it will print true
    println(num1.any { it % 2==0 })
    println(num1.any { it > 5})

    //all values must be divided by 2 then only it will return true
    println(num1.all{ it % 2==0 })
    println(num1.all{it < 10})

    println(num1.count())
    println(num1.count(){it >2})

    println("maximum no elements in list : ${num1.max()}")
    println("minimum no elements in list : ${num1.min()}")

    println("=============================================")
}
