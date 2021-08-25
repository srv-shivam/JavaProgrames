package kotlinCodes

import java.util.*

fun main() {
    sum()
    val result = subtract()
    println("Subtraction is : $result")
    noReturn()
    val mul = multiply(14, 6)
    println("Multiplication is : $mul")

    takeUserInput()
}

fun takeUserInput() {

    val sc = Scanner(System.`in`)
    print("Enter a Number : ")
    val a: Int = sc.nextInt()
    println("Number entered is : $a")
}

fun sum() {
    val num1 = 10
    val num2 = 20
    println("Sum is : " + (num1 + num2))
}

// Int return type of method
fun subtract(): Int {
    val num1 = 10
    val num2 = 5
    val sub = num1-num2
    return sub
}

// Void return type of method
fun noReturn(): Unit {
    println("Shivam Srivastava")
}

// Parameters with return type
fun multiply(X: Int, Y: Int): Int {
    return (X*Y)
}