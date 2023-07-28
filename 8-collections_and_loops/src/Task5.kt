/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val e1 = Employee("Ion", 22)
    val e2 = Employee("Sasha", 24)
    val e3 = Employee("Felicy", 20)

    val d1 = Department("IT", listOf(e1, e1))
    val d2 = Department("HR", listOf(e3))

    val c = Company("Viatec", listOf(d1, d2))

    println(totalNumberOfEmployees(c))
    println(averageAgeOfEmployees(c))
}

fun totalNumberOfEmployees(company: Company): Int{
    var numberOfEmployees = 0
    for (department in company.departments){
        numberOfEmployees += department.employees.size
    }
    return numberOfEmployees
}

fun averageAgeOfEmployees(company: Company): Int{
    var sum = 0
    var numberOfEmployees = 0
    for (department in company.departments){
        for (employee in department.employees){
            numberOfEmployees++
            sum += employee.age
        }
    }
    return sum/numberOfEmployees
}