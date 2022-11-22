package inheritance

fun main(args: Array<String>){
    val obj1 = Programmer("Deepti", 22, 40000f)
    obj1.doProgram()
    println("================================================")
    val obj2 = Salesman("Supriya", 25, 30000f)
    obj2.fieldWork()
}
open class Employee(name: String, age: Int, salary: Float) {
    init {
        println("Name of Employee is $name.")
        println("Age of Employee is $age")
        println("Salary of Employee is $salary")
    }
}
class Programmer(name: String, age: Int, salary: Float):Employee(name,age,salary){
    fun doProgram() {
        println("Programming is my Passion.")
    }
}
class Salesman(name: String, age: Int, salary: Float):Employee(name,age,salary){
    fun fieldWork() {
        println("Travelling is my Hobby.")
    }
}