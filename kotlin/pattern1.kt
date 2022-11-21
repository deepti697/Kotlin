import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number of rows: ")
    var row = sc.nextInt()
    print("Enter the number of columns : ")
    var col = sc.nextInt()
    for (i in row downTo 1){
        for (j in 1..i){
            print(" *")
        }
        println("")
    }
}