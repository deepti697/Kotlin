package inheritance

fun main(args: Array<String>) {
    val duck = Duck()
    duck.fly()
    duck.swim()
}
open class Bird {
    fun fly() {
        println("Birds are flying in the sky!!!!!")
    }
}
class Duck:Bird() {
    fun swim() {
        println("Ducks are swimming!!!!!")
    }
}