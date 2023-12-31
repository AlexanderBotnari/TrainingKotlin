/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user = User("Kirill", 24, 3)
    val car1 = Car("BMW", "x5", 15.3)
    val car2 = Car("Kia", "Rio", 10.1)
    val car3 = Car("Renault", "Capture", 10.5)

    val cars = listOf(car1, car2, car3)

    val avaliableCars = getAvaibleVehicles(cars, user)

    println(avaliableCars)
}

fun getAvaibleVehicles(cars: List<Car>, user: User):List<Car>{
    val result = mutableListOf<Car>()
    for (car in cars){
        val condition1 = user.age >= 26 && user.experience >= 6
        val condition2 =user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW"
        if (condition1 || condition2)
            result.add(car)
    }
    return result
}