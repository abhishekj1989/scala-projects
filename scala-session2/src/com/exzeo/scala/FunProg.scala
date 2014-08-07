package com.exzeo.scala

object FunProg {
  case class Employee(id: Int,
    firstName: String,
    lastName: String,
    designation: String,
    salary: Float,
    department: String)

  def main(args: Array[String]): Unit = {

    val employees = List(
      Employee(10, "Saleem", "Ansari", "Software Engineer", 130.0f, "Java"),
      Employee(11, "Shalini", "Sharma", "Designer", 111.0f, ".Net"),
      Employee(12, "Varun", "Gupta", "Backend Engineer", 211.0f, "C"),
      Employee(13, "Sulabh", "Agarwal‎", "Hacker Hacker", 10.0f, "C++"),
      Employee(14, "Ambika", "Sharma", "Engineer", 160.0f, "Java"),
      Employee(15, "Mridul", "Srivastava‎", "Coder", 210.0f, "Java"),
      Employee(16, "Ajay", "Soni‎", "Software Craftsman", 180.0f, "Ruby"),
      Employee(17, "Abhishek", "Jaiswal", "Systems Engineer", 110.0f, "Scala"),
      Employee(18, "Eshu", "Goel", "Architect", 90.0f, "Python"))

    //      val sum = employees.foldLeft(0.0f)((a,b) => a + b.salary)
    //      val avg = sum / employees.length
    //      
    //      employees.filter(x => x.salary >= avg)

    println("Sorted by ID")
    employees.sortBy(x => x.id) foreach println
    println("Sorted by lastName")
    employees.sortBy(_.lastName) foreach println

    val sum = employees.foldLeft(0.0f)((a, b) => a + b.salary)
    val average = sum / employees.length

    println("Above average:")
    employees.filter(x => x.salary >= average) foreach println

    println("Below average:")
    employees.filter(x => x.salary < average) foreach println

    val (rich, poor) = employees.partition(x => x.salary >= average)

    println("Rich:")
    println(rich)
    println("Poor:")
    println(poor)
  }
}
