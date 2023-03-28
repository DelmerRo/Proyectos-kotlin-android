package com.jindrg.androidmaster.exercises

/*2. Notificaciones móviles
Por lo general, el teléfono te proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje debe incluir lo siguiente:

La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más*/

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    val TOPE_MAX: Int = 100;
    val TOPE_MIN: Int = 1;
    if (numberOfMessages <= TOPE_MAX && numberOfMessages >= TOPE_MIN ) {
        println("You have $numberOfMessages notifications.");
    } else if (numberOfMessages > TOPE_MAX){
        println("Your phone is blowing up! You have " + (TOPE_MAX - 1) + "+ notifications.")
    }else{
        println("Numero ingresado es incorrecto");
    }
}
