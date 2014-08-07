package com.exzeo.scala

object Driver {

  case class Employee(id: Int,
    firstName: String,
    lastName: String,
    salary: Float,
    designation: String)

  def main(args: Array[String]): Unit = {
    val employees = List(
      Employee(30, "Abhishek", "Jaiswal", 40000.0f, "Java Developer"),
      Employee(10, "Prashant", "Kumar", 30000.0f, "Java Developer"),
      Employee(20, "Subodh", "Yadav", 60000.0f, "Java Developer"))
    println(employees.sortBy(x => x.id))
    println(employees.sortBy(_.id))
    println(employees.sortBy(x => x.lastName))
    println(employees.sortBy(_.lastName))
    var sum = 0.0f
    for (e <- employees) {
      sum += e.salary
    }
    println(sum / employees.length)

    sum = employees.par.foldLeft(0.0f)((a, b) => a + b.salary)
    println(sum / employees.length)
  }

}