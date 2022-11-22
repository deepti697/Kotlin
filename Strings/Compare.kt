package Strings

fun main(args: Array<String>){
    val str1 = "Hello World!"
    val str2 = "World!"

    //returns Boolean Values
    println(str1==str2)
    println(str1!=str2)

    if (str1==str2)
        println("Strings are equal!!")
    else
        println("Strings are not equal!!")
}