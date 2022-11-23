package collections

fun main() {

    var num1= mutableListOf<Int>(1,2,3,4,5,6)
    //first 3 will be droped
    println(num1.drop(3))
    println()
    //first 5 will be droped
    println(num1.drop(5))
    println()
    println(num1.dropLast(2))
    println()
    println(num1.dropWhile{it<4})
    println()
    var filtredList= num1.filter { it % 2 ==0 }
    println("filtredList : $filtredList")
    println()
    print("Opposite of filtered list : ")
    println(num1.filterNot { it % 2 ==0 })
    println()
    println(num1.take(2))
    println(num1.takeLast(2))
    println("=============================================")
    println(num1.takeWhile { it<4 })
    println(num1.takeWhile { it>4 })//if fist element false only, it will return
    println("=============================================")
    println(num1.takeLastWhile { it >4})

}