/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val e1 = Employee("Ion", 20)
    val e2 = Employee("Sasha", 24)

    println(getMinEmployee(listOf(e1, e2)))
}

fun getMinEmployee(employees: List<Employee>): Employee{
    var minAgeEmployee = employees[0]

    for( employee in employees){
        if (employee.age < minAgeEmployee.age)
            minAgeEmployee = employee
    }
    return minAgeEmployee
}