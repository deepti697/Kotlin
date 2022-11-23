package collections

fun main() {
    var num1= mutableListOf<Int>(1,2,5,6,9,1,2)
    println(num1)

    var numWithoutDuplicate = num1.toSet()
    println(numWithoutDuplicate)
}