import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number to find fibonacci Series : ")
    var num = sc.nextInt()
    var a = 0
    var b = 1
    println("$a")
    for(i in 1 .. num){
        println("$b")
        //Swapping
        var temp = b
        b = a + b
        a = temp
    }
    println()
}