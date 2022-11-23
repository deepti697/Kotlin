package collections

fun main(args: Array<String>) {
    var num1= mutableListOf<Int>(1,2,5,6,9)
    var num2= mutableListOf<Int>(11,2,5,16,19)

    println("Num1 $num1")
    println("Num2 $num2")

    num1.add(10)
    num1.addAll(num2)
    println("After adding $num1")

    //it will remove elements from num1 which are present in num2
    num1.removeAll(num2)
    println("After removing $num1")

    //take back:Comman elements
    num1.retainAll(num2)
    println("After Retaining $num1")

}