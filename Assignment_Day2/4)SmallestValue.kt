package com.Assignment_Day2
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    print("Enter the size of array : ")
    var size = sc.nextInt()

    var num = Array(size,{0})
    for (i in 0.. size-1){
        print("Enter the value for $i : ")
        num.set(i,sc.nextInt())
    }
    num.sort()
    println("Smallest value in the array is : ${num.first()}")
}