/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val user1: User = User("Ivan", 30, 10)
    println(getAvaibleAuto(user1))

    val car1 = Car("BMW", 100)
    println(isAvaibleAuto(car1, user1))
}

data class User(val name:String, val age:Int, val experience:Int)

data class Car(val brand:String, val rentPrice: Int)

fun getAvaibleAuto(user: User):String{
    val result = if(user.age >= 26 && user.experience>=6)
        "all auto avaible"
    else if (user.age >= 21 && user.experience >= 2)
        "common auto avaible without audi and bmw"
    else
        "age or experience error"

    return result
}

fun isAvaibleAuto(car: Car, user: User):Boolean{
    val result = if (user.age >= 26 && user.experience >= 6)
        true
    else user.age >= 21 && user.experience >= 2 && car.brand != "BMW" && car.brand != "Audi"

    return result
}