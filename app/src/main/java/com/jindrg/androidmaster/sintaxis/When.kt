package com.jindrg.androidmaster

fun main() {
    getMonth(2);
    getTrimestre(3);
    getSemestre(12);
    getSemestreConRetorno(12);
    getSemestreConRetornoCorto(12);
    getTipoDeObjeto("Delmer");

}

fun getSemestreConRetornoCorto(mount: Int) =
     when (mount) {
        in 1..6 -> "Primer semestre";
        in 6..12 -> "segundo semestre";
        !in 1..12 -> "Semestre no valido";
        else -> "Nada"
    }

fun getSemestreConRetorno(month: Int): String {
    return when (month) {
        in 1..6 -> "Primer semestre";
        in 6..12 -> "segundo semestre";
        !in 1..12 -> "Semestre no valido";
        else -> "Nada"
    }
}

fun getTipoDeObjeto(value: Any) {
    when (value) {
        is Int -> value + value;
        is String -> println(value);
        is Boolean -> if (value) print("soy booleano");
    }
}

fun getSemestre(month: Int) {
    when (month) {
        in 1..6 -> println("Primer semestre");
        in 6..12 -> println("segundo semestre");
        !in 1..12 -> println("Semestre no valido");
    }
}

fun getTrimestre(month: Int) {
    when (month) {
        1, 2, 3 -> println("primer Trimestre")
        4, 5, 6 -> println("segundo Trimestre")
        7, 8, 9 -> println("terccer Trimestre")
        10, 11, 12 -> println("cuarto Trimestre")
        else -> println("Trimeste no valido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero");
        2 -> println("Febrero");
        3 -> println("Marzo");
        4 -> println("Abril");
        5 -> println("Mayo");
        6 -> println("Junio");
        7 -> println("Julio");
        8 -> println("Agosto");
        9 -> println("Septiembre");
        10 -> println("Octubre");
        11 -> println("Noviembre");
        12 -> println("Diciembre");
        else -> println("No es un mes valido");
    }

}