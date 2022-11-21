import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number of rows: ")
    val rows= sc.nextInt()
    for(i in 0 ..rows){
        for(j in 0 ..rows-i){
            print(" ")
        }
        for(k in 0.. i){
            print("* ")
        }
        println("")
    }

}