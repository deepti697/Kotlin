package collections

fun main(args: Array<String>) {
    var marks:MutableList<Int> = mutableListOf<Int>(10,56,56,98,78)
    println(marks)
    println()

    marks.add(99)
    marks.add(90)
    println(marks)

    println("Size ${marks.size}")
    println("Contains 90 ${marks.contains(90)}")
    println("Contains 20 ${marks.contains(20)}")

    marks.remove(56)
    println(marks)
    marks.remove(2)
    println(marks)

    marks.add(1,25)
    println("after adding the element in list , updated list is : ")
    println(marks)

    marks.clear()//empty the list
    println(marks)

}