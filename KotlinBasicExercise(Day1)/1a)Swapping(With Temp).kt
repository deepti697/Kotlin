import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the First number: ")
    var num1 = sc.nextInt()
    print("Enter the Second number: ")
    var num2 = sc.nextInt()
    var temp = 0
    println("---- Numbers before Swapping ----")
    println("First Number: $num1")
    println("First Number: $num2")

    //Swapping logic
    temp = num1
    num1 = num2
    num2 = temp

    println("---- Numbers after Swapping ----")
    println("First Number: $num1")
    println("First Number: $num2")
    
}
