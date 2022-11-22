package Strings

fun main(args: Array<String>) {
    val a = "Deepti"
    val b = " Mhatre"
    println("String 1: " + a)
    println("String 2: " + b)
    println("1)USING $ ")
    println("Concatenated String: " + "$a$b")

    println("2)USING STRINGBUILDER ")
    println("Concatenated String: " + StringBuilder().append(a).append(b).toString())

    println("3)USING $ ")
    println("Concatenated String: " + a+b)
}