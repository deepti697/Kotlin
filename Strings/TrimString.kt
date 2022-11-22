package Strings

fun main(args: Array<String>) {
    println("Original String: ")
    val text1 = """Kotlin is official language  
        |announce by Google for  
        |android application development  
        """
    println(text1)

    println("String After using trim Function......")
    val text = text1.trimMargin()
    println(text)
}
