import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number to reverse : ")
    var num = sc.nextInt()
    var rev = 0

    while(num != 0){
        var temp = num % 10
         rev = rev * 10 + temp
         num /= 10
    }
    println("The reverse of  number is $rev ")
}