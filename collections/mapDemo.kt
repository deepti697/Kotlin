package collections

fun main() {

    var players = mutableMapOf<String,String>()

    players.put("Sachin","Sachin is cricket player ")
    players.put("Bumra","Bumra is cricket player ")
    players.put("Dhoni","Dhoni is wicket keeper batsman ")
    players.put("Shami","Shami is bowler ")
    players.put("Dhoni","Dhoni is coach ")
    players.put("Dravid","Dravid is batsman ")

    println(players)
    println("Size = ${players.size}")
    println("Keys = ${players.keys}")
    println("Values = ${players.values}")
    println("both keys and values = ${players.entries}")
    println("Get Key = ${players.get("Dravid")}")

    println("=====================================")
    println("Prinitng keys using for loop...")
    for (key in players.keys)
        println(key)
    println("=====================================")
    println("Prinitng keys&values using for loop...")
    for (keyvalue in players.entries)
        println(keyvalue)
}