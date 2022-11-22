package visibility

fun main(args: Array<String>) {
    var animal= Animal()
    println(animal.b)
    println(animal.d)
}
//open keyword to extend other class
open class Animal{
    private var a=1
    internal var b= 2
    protected var c=3
    var d =4

    fun test(){
        println(a)
        println(b)
        println(c)
        println(d)
    }
}
class Cow :Animal(){ //extending the animal class
    fun testing(){
        println("Value of c $c")
    }
}
class Dog{
    var animal= Animal()
    fun test2(){
        //a is not accessible because it is private
        //c is not accessible because it is protected(it can be accessible only in sub class)
        println(animal.b)
        println(animal.d)
    }
}
