package com.axis.dbconnection
import java.sql.DriverManager

fun main() {

    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Deepti@9987$")
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val prestmt =connection.prepareStatement("Insert into users values(?,?)")
    prestmt.setInt(1,1)
    prestmt.setString(2,"Pari")
    prestmt.execute()
    val result=prestmt.executeUpdate()
    if(result>0){
        println("inserted")
    }else{
        println("not inserted")
    }

}