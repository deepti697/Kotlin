package collections

//immutable list cannot be changed
fun main(args: Array<String>) {
    var marks:List<Int> = listOf<Int>(10,56,56,98,78)
    println(marks)

    for (i in marks)
        print(i)

    println()
    println("Size : ${marks.size}")
    println("element at index 0 is ${marks[0]}")
    println("First element : ${marks.first()}")
    println("last element : ${marks.last()}")

}