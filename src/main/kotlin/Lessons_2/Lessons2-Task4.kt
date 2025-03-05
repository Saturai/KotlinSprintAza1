package org.example.Lessons_2

fun main() {

    val iron = 11
    val crystal = 7

    val baff = 0.2 // 20% бонусного повышения

    val baffIron = (iron * baff).toInt()
    val baffCrystal = (crystal * baff).toInt()

    println("Железо увеличено на:$baffIron")
    println("Кристалы увеличены на:$baffCrystal")


}