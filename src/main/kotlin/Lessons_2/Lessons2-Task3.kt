package org.example.Lessons_2

fun main() {

    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTime = 457

    val transferOfHour = travelTime / 60   //перевел travelTime в часы
    val transferOfMinute = travelTime % 60   //вывел остаток минут из travelTime

    val arrivalHour = hourDeparture + transferOfHour
    val arrivalMinute = minuteDeparture + transferOfMinute


    println("Время прибытия $arrivalHour : $arrivalMinute")



}