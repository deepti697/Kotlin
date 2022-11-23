package collections

fun main() {
    //direct initilization
    var product = mutableMapOf<String,Int>("Laptop" to 2000,"Smartwatch" to 1000,"Mobile" to 5000)
    println(product)

    println("=====================================")
    for (keyvalue in product.entries){
        println(keyvalue)
    }

    println("=====================================")
    for (keyvalue in product.entries){
        println("$keyvalue,  ${keyvalue.key}  , ${keyvalue.value}")
    }
}