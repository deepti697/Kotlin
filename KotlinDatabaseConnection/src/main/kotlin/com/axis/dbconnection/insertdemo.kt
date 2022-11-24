package com.axis.dbconnection

import java.sql.DriverManager

//model class
//data class User(var id:Int, val name:String)

fun main() {
    val dbConnection =DbConnection()
    val connection= dbConnection.connect()
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val stmt =connection.createStatement()
    val res = stmt.executeUpdate("Insert into users values(4,'Hardik')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }
}