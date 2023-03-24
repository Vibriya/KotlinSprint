package lesson_2

fun main() {
    val countOfStaff = 50
    val staffSalary = 30000
    val countOfTrainee = 30
    val traineeSalary = 20000

    val expenseOnStaff = countOfStaff * staffSalary
    val generalExpense = expenseOnStaff + countOfTrainee * traineeSalary
    val averageSalary = generalExpense / (countOfStaff + countOfTrainee)

    println(expenseOnStaff)
    println(generalExpense)
    println(averageSalary)
}