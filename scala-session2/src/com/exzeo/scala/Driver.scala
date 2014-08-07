package com.exzeo.scala

object Driver {

  case class Employee(id: Int,
    firstName: String,
    lastName: String,
    designation: String,
    salary: Float,
    department: String)

  case class Customer(name: String, id: Int)

  def main(args: Array[String]): Unit = {

    val employees = List(
      Employee(10, "Saleem", "Ansari", "Engineer", 10.0f, "Java"),
      Employee(11, "Shalini", "Sharma", "Engineer", 111.0f, ".Net"),
      Employee(12, "Varun", "Gupta", "Engineer", 211.0f,
        "Java") //      ,Customer("Ajay", 22),
        //      "Hello",
        //      10
        )

    println(employees.sortBy(x => x.id))
    println(employees.sortBy(_.lastName))

  }

}