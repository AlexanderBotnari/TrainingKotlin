/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс Userуже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
data class User(val name:String, val age:Int)

fun main() {
    val users = listOf(
        User("Ion", 30),
        User("Sergiu", 33),
        User("Sandu", 31)
    )

    val result = convertToStrings(users){"Name: ${it.name}, Age: ${it.age}"}
    println(result)
}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{
    val results = mutableListOf<String>();
    for(user in users){
        val string = conversion(user)
        results.add(string)
    }
    return results;
}