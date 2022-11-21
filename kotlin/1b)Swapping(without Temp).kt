import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the First number: ")
    var num1 = sc.nextInt()
    print("Enter the Second number: ")
    var num2 = sc.nextInt()

    num1 = num1 - num2
    num2 = num1 + num2
    num1 = num2 - num1

    println("-----Numbers after Swapping-----")
    println("First number = $num1")
    println("Second number = $num2")

}