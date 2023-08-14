/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
fun main(){
    val rectangle = Rectangle("red", 10, 10)
    val round = Round("blue", 10)

    rectangle.calculateAria()
    round.calculateAria()
}

abstract class Figure(val color:String){
    var x:Int = 0
    var y:Int = 0

    fun moveLeft(step:Int){
        x -= step
    }

    fun moveRight(step: Int){
        x += step
    }

    fun moveDown(step: Int){
        y -= step
    }

    fun moveUp(step: Int){
        y += step
    }

    abstract fun calculateAria()

    abstract fun calculateLength()

}
class Rectangle(color: String, val width:Int, val height:Int):Figure(color){

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

class Round(color: String, val radius:Int):Figure(color){

    override fun calculateAria(){
        println("Aria of round is ${Math.PI*this.radius*this.radius}")
    }

    override fun calculateLength(){
        println("Length of round is ${2*Math.PI*this.radius}")
    }
}