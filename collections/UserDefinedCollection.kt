package collections

class Product(id:Int, name:String, price:Double){
    var id:Int=id
    var name:String=name
    var price:Double= price
}
fun main(args: Array<String>) {
    var products= mutableListOf<Product>()
    products.add(Product(0,"laptop",60000.23))
    products.add(Product(1,"Mobile",16000.23))
    products.add(Product(2,"SmartWatch",20000.23))
    //println(Product)

    for(product in products)
        println("${product.id},${product.name},${product.price}")
}