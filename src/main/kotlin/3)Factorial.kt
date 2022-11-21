import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number to find factorial : ")
    var num = sc.nextInt()
    var fac = 1
    if(num < 0)
        println("Invalid Number : We cannot find factorial of negative numbers!!")
    else{
        for (i in 1.. num){
            fac = fac * i
        }
       println("Factorial of $num = $fac")
    }


}