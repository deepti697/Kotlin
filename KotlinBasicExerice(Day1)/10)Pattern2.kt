import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number of rows: ")
    var row = sc.nextInt()
    print("Enter the number of columns : ")
    var col = sc.nextInt()
    for (i in 1..row){
        for (j in i downTo 1){
            print("$j")
        }
        println(" ")
    }
}
