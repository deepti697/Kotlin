import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the year to check whether leap or not: ")
    var year = sc.nextInt()
    if(year %400 == 0)
        println("$year is leap year!!!!")
    else if (year % 4 == 0 && year % 100 != 0)
        println("$year is a leap year !!!")
    else
        println("$year is not a leap year......")
}