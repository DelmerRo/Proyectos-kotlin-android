package com.jindrg.androidmaster

val age: Int = 30

fun main() {
    showMyName()
    showMyAge()
    add(10, 5)
    val mySubtract = subtract(10, 5)
    print(mySubtract)
}

fun showMyName() {
    println("Me llamo Delmer")
}

fun showMyAge(curentAge: Int = 30) {
    println("tengo $curentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun variablesBoolean() {
    /**VARIABLES BOOLEANAS**/
    //Boolean
    val booleanExample: Boolean = true
    val booleanExample1: Boolean = false
    val booleanExample2: Boolean = true
}

fun variablesAlfanumericas() {
    /**VARIABLES ALFANUMERICAS**/
    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val StringExample: String = "Hola"
    val stringExample2 = "Jindrg"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example123: String = age.toString()
}

fun variablesNumericas() {
    /**VARIABLES NUMERICAS**/
    //int
    var age2: Int = 30
    age2 = 29

    //Long
    val longExample: Long = 12345677777

    //Float
    val floatExample: Float = 15.2f

    //Double
    val doubleExample: Double = 12.5

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Dividir:")
    println(age / age2)

    println("Modulo:")
    println(age % age2)

    var exampleSuma = age + floatExample
}