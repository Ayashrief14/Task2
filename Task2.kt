fun calculate(number1:Int,number2:Int,function:(Int,Int)->Int){
    val result = function(number1, number2)
    println(result )
}

fun main(){
    val sum: (Int, Int) -> Int = { number1, number2 -> number1 + number2 }
    val multiply: (Int, Int) -> Int = { number1, number2 -> number1 * number2 }
    val minus: (Int, Int) -> Int = { number1, number2 -> number1 - number2 }
   val num1 = 9
    val num2 = 5

    println(calculate(num1,num2,sum))
    println(calculate(num1,num2,multiply))
    println(calculate(num1,num2,minus))
}
