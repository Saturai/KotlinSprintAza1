package org.example.Lessons_2

fun main() {

    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTime = 457

    val transferOfMinutes = hourDeparture * Minutes_In_Hours
    val summMinutes = transferOfMinutes + minuteDeparture + travelTime

    val arrivalHour = summMinutes / Minutes_In_Hours
    val arrivalMinute = summMinutes % Minutes_In_Hours

    println("Время прибытия $arrivalHour : $arrivalMinute")

}

const val Minutes_In_Hours = 60