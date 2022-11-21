import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    print("Enter number to check if armstrong : ")
    var num = sc.nextInt()
    var result = 0
    var temp = num

    while (num != 0) {
       var rem = num % 10
        result += rem*rem*rem
        num /= 10
    }

    if (result == num)
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")
}