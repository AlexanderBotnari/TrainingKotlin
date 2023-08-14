/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/
fun main(){
    val triangle = Triangle("red", 2.0, 2.0, 3.0)
    triangle.calculateAria()
    triangle.calculateLength()
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
class Triangle(color: String, val a:Double, val b:Double, val c:Double):Figure(color){
    override fun calculateAria(){
        val p=(a+b+c)/2.0
        println("Aria: ${Math.sqrt(p*(p-a)*(p-b)*(p-c))}")
    }

    override fun calculateLength(){
        println("Length: ${a+b+c}")
    }
}