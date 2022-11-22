package inheritance

fun main(args: Array<String>) {
    // created object for child so both the child and parent obj is created
    var child = Child()
    //but if u created parent obj only paranet obj will be created
    child.display()
    //child.test()
}
open class Parent{
    /*
    constructor(){
        println("Parent Constructor")
     */
    fun display(){
        println("Parent Class Display")
    }
}
class Child :Parent(){
   /*init {
       println("Child Class")
   }*/
    fun test(){
        println("Child Class Test")
    }
}