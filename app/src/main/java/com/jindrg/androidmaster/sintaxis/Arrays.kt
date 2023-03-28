package com.jindrg.androidmaster

fun main(){
    var name: String = "Jindrg";
    var name1: String = "Jindrg";
    var name2: String = "Jindrg";
    var name3: String = "Jindrg";

    val weekDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");

    println(weekDays[0])
    println(weekDays.size)

    //Tamaños
    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay mas valores en el array")
    }


//Modificar valores
    weekDays[0]= "Feliz Lunes"

    println(weekDays[0])

//Bucles para Arrays
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("la position $position , contiene $value")
    }

    for(weekDay in weekDays ){
        println("Ahora es $weekDay")
    }
}