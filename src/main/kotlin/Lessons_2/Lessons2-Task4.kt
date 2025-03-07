package org.example.Lessons_2

fun main() {

    val iron = 11
    val crystal = 7

    val baff20Percent: Float = 20/100F //20% бонусного повышения

    val baffIron = (iron * baff20Percent).toInt()
    val baffCrystal = (crystal * baff20Percent).toInt()

    println("Железо увеличено на:$baffIron")
    println("Кристалы увеличены на:$baffCrystal")


}