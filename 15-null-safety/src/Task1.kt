/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val e1 = SomeEmployee("Ion", 2000)
    val e2 = SomeEmployee("Sanea", 4000)
    val e3 = SomeEmployee("Felicy", 6000)

    val eList = listOf<SomeEmployee>(e1, e2, e3)

    val employee = findEmployeeBySalary(eList, 20000)
    println(employee)
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }

}

fun findEmployeeBySalary(employees:List<SomeEmployee>, salary:Int):SomeEmployee?{
    for(employee in employees)
        if (employee.salary == salary)
            return employee

    return null
}