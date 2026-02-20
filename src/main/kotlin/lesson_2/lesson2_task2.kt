package org.example.lesson_2

fun main() {
    val employeesNumber = 50
    val employeeSalary = 30000
    val traineesNumber = 30
    val traineeSalary = 20000

    val employeesSalaryAll = employeeSalary * employeesNumber
    val salaryAll = employeesSalaryAll + traineesNumber * traineeSalary
    val averageSalary = salaryAll / (employeesNumber + traineesNumber)

    println("%d".format(employeesSalaryAll))
    println("%d".format(salaryAll))
    println("%d".format(averageSalary))

}