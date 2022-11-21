import java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter the number of rows: ")
    val rows= sc.nextInt()
    var k=0
    for(i in 1..rows){
        for(j in 1..rows-i){
            print(" ")
        }
        while(k != 2*i-1){
            print("*")
            ++k
        }
        println()
        k=0
    }
}