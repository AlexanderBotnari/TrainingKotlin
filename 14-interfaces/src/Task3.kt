/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val animal = Animal("zebra")
    val rectangle = Rectangle("red", 20, 20)
    val round = Round("yellow", 30)
    val triangle = Triangle("blue", 5, 5, 5)

    val movables = listOf<Movable>(animal, rectangle, round, triangle)

    for (movable in movables){
        movable.moveRight(10)
        println("Moved with step 10")
    }
}

interface Movable{
    fun moveLeft(step:Int)
    fun moveRight(step:Int)
    fun moveDown(step:Int)
    fun moveUp(step:Int)
}
class Animal(val name:String):Movable{

    var x:Int = 0
    var y:Int = 0
    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveUp(step: Int) {
        y += step
    }
}
abstract class Figure(val color:String): Movable{
    var x:Int = 0
    var y:Int = 0

    override fun moveLeft(step:Int){
        x -= step
    }

    override fun moveRight(step: Int){
        x += step
    }

    override fun moveDown(step: Int){
        y -= step
    }

    override fun moveUp(step: Int){
        y += step
    }

    abstract fun calculateAria()

    abstract fun calculateLength()

}
class Rectangle(color: String, val width:Int, val height:Int):Figure(color), Movable{

    override fun moveLeft(step:Int){
        x -= step
    }

    override fun moveRight(step: Int){
        x += step
    }

    override fun moveDown(step: Int){
        y -= step
    }

    override fun moveUp(step: Int){
        y += step
    }
    override fun calculateAria(){
        println("Aria of rectangle is ${this.width*this.height}")
    }

    fun calculatePerimeter(){
        println("Perimeter of rectangle is ${2*(this.width+this.height)}")
    }

    fun isRectangleSquare(): Boolean{
        if (this.width == this.height){
            return true
        }else{
            return false
        }
    }

    override fun calculateLength() {
        println("Width: ${width}, Height: ${height}")
    }
}
class Round(color: String, val radius:Int):Figure(color), Movable{
    override fun moveLeft(step:Int){
        x -= step
    }

    override fun moveRight(step: Int){
        x += step
    }

    override fun moveDown(step: Int){
        y -= step
    }

    override fun moveUp(step: Int){
        y += step
    }
    override fun calculateAria(){
        println("Aria of round is ${Math.PI*this.radius*this.radius}")
    }

    override fun calculateLength(){
        println("Length of round is ${2*Math.PI*this.radius}")
    }
}
class Triangle(color: String, val a:Int, val b:Int, val c:Int):Figure(color), Movable{
    override fun moveLeft(step:Int){
        x -= step
    }

    override fun moveRight(step: Int){
        x += step
    }

    override fun moveDown(step: Int){
        y -= step
    }

    override fun moveUp(step: Int){
        y += step
    }
    override fun calculateAria(){
        val p=(a+b+c)/2.0
        println("Aria: ${Math.sqrt(p*(p-a)*(p-b)*(p-c))}")
    }

    override fun calculateLength(){
        println("Length: ${a+b+c}")
    }
}