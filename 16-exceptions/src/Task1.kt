/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val e1 = SomeEmployee("Ion", 2000)
    val e2 = SomeEmployee("Sanea", 4000)
    val e3 = SomeEmployee("Felicy", 6000)

    val eList = listOf<SomeEmployee>(e1, e2, e3)

    try {
        val employee = findEmployeeBySalary(eList, 2000)
        println(employee)
    }catch (e:Exception){
        println(e.message)
    }
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees:List<SomeEmployee>, salary:Int):SomeEmployee{
    for(employee in employees)
        if (employee.salary == salary) {
            return employee
        }

    throw Exception("employee with this salary not find")
}