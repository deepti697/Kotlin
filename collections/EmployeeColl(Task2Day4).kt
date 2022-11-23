package collections

class Employee(id:Int,name:String,age:Int,dept:String,salary:Double){
    var id:Int=id
    var name:String=name
    var age:Int = age
    var dept:String=dept
    var salary:Double= salary
}

fun main(args: Array<String>) {
    var employees = mutableListOf<Employee>()
    employees.add(Employee(0,"Deepti",22,"IT",66000.3))
    employees.add(Employee(1,"Krisha",29,"HR",60000.93))
    employees.add(Employee(2,"Hardik",28,"Marketing",56000.23))
    employees.add(Employee(3,"Suyash",24,"IT",76000.93))

    for(emp in employees)
        println("ID: ${emp.id}, Name: ${emp.name}, Age: ${emp.age}, Department: ${emp.dept}, Salary: ${emp.salary}")
}
