/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/
interface Movable{
    fun moveLeft(step:Int)
    fun moveRight(step:Int)
    fun moveDown(step:Int)
    fun moveDown(step:Int)
}

class Animal(val name:String, val x:Int, val y:Int):Movable{
    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveDown(step: Int) {
        y += step
    }
}