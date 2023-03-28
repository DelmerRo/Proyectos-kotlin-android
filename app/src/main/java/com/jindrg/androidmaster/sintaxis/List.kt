package com.jindrg.androidmaster

fun main(){
    mutableList()
    //inmutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    weekDays.add("DelDay")
    println(weekDays)

   /* if(weekDays.isEmpty()){
        println("")
    }else{
        weekDays.forEach{unDia -> println(unDia)}
    }*/

    if(weekDays.isNotEmpty()){
        weekDays.forEach{ println(it)}
    }

    weekDays.last()

    for(unDia in weekDays){

    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");

    println(readOnly.size);
    println(readOnly);
    println(readOnly[0]);
    println(readOnly.last())
    println(readOnly.first());

    //Filtrar
    val example = readOnly.filter{it.contains("es")}//Contains muestra de la lista los que contienen ese caracter.
    println(example)

    readOnly.forEach{weekDay -> println(weekDay)} //la variable it que lo reconoce Kotlin le cambio de nombre por weekDay
}