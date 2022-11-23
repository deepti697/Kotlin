package collections

fun main() {
    var javabatch= mutableListOf<String>("anil","gopal","ankit","manish","anil")
    var kotlinbatch= mutableListOf<String>("ankit","kumar","manish","rahul")


    //removing duplicate from java batch
    var javabatchWithoutDuplicate = javabatch.toSet()
    println("JavaBatch after removing duplicates: $javabatchWithoutDuplicate")

    //sort data in ascending order
    javabatch.sort()
    kotlinbatch.sort()
    println("Java Batch after sorting: $javabatch")
    println("Kotlin Batch after sorting: $kotlinbatch")
    //combine in one batch
    javabatch.addAll(kotlinbatch)
    println("After combining : $javabatch")
    //remove duplicate
    javabatch.removeAll(kotlinbatch)
    println("Priniting javabatch and removing elements present in kotlinbatch duplicate : $kotlinbatch")
    println("After removing duplicate elements:${javabatch.distinct()}")


}
