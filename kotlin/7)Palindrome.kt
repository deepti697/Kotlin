import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number to check palindrome or not : ")
    var num = sc.nextInt()
    var temp = num
    var rev = 0
    while (num > 0){
        var digit = num % 10
        rev = rev * 10  + digit
        num = num / 10
    }
    if (temp == rev)
        println("Number is Palindrome !!!!")
    else
        println("Number is not a Palindrome !!!")
}