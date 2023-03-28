package com.jindrg.androidmaster

fun main() {
    ifAnidado();
    ifBoolean();
    ifInt();
    ifMultiple();
}

fun ifMultiple() {
    var age = 18;
    var parentPermission = false;
    var imHappy = true;
    if(age >= 18 && !parentPermission && imHappy){
        println("Puedo beber cerveza")
    }
}

fun ifInt(){
    var age = 29;

    if(age > 18){
        println("beber Cerveza")
    }else{
        println(" beber Jugo")
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = false
    //sin nada == true
    //con ! al principio es false

    if (!soyFeliz) {
        println("Estoy Triste")
    }
}

fun ifAnidado() {
    val animal = "Arias";

    if (animal == "dog") {
        println("Es un perrito");
    } else if (animal == "cat") {
        println("Es un cat");
    } else if (animal == "bird") {
        println("Es un bird");
    } else {
        println("No es uno de los animales esperados");
    }
}
