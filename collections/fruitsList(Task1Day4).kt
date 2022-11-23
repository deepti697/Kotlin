package collections

fun main(args: Array<String>) {
    var fruits:MutableList<String> = mutableListOf("Papaya","Mango","Strawberry","Kiwi")
    println(fruits)

    println()

    fruits.add("Apple")
    fruits.add("Guava")
    println(fruits)

    println("Contains Apple ${fruits.contains("Apple")}")
    println("Contains Mango ${fruits.contains("Mango")}")
}