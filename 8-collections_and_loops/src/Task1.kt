/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val userList = listOf<Employee>(Employee("Ion", 20), Employee("Sasha", 24))
    println(getAverageAge(userList))
}

fun getAverageAge(users: List<Employee>): Int{
    var sum = 0
    for(user in users){
        sum += user.age
    }
    return sum / users.size
}