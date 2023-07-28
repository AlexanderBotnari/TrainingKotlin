/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val e1 = Employee("Ion", 22)
    val e2 = Employee("Sasha", 24)
    val e3 = Employee("Felicy", 20)

    val d = Department("IT", listOf(e1, e2, e3))

    println(getAverageAgeOfDep(d))
}

fun getAverageAgeOfDep(department: Department):Int{
    var sum = 0
    for (employee in department.employees){
        sum += employee.age
    }
    return sum/department.employees.size
}
