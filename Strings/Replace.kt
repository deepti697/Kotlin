package Strings

fun main(args: Array<String>) {

    var str = "Deepti Gajanan Mhatre"
    val oldValue = "MHATRE"
    val newValue = "Patil"

    val output1 = str.replace(oldValue, newValue, ignoreCase = true)
    println(output1)
    val output2 = str.replace(oldValue, newValue, ignoreCase = false)
    println(output2)
}