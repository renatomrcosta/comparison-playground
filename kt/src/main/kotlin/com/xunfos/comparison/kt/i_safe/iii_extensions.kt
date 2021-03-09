package com.xunfos.comparison.kt.i_safe

fun main() {
    val sum = BOARDGAME_LIST
        .filter { it.numberOfPlayers >= 2 }
        .filter { it.maximumAge >= 10 }
        .map { it.price }
        .sum()

    println("Sum was $sum")
}

private val BOARDGAME_LIST = listOf(
    Boardgame(numberOfPlayers = 2, minimumAge = 10, maximumAge = 99, name = "Bohnanza", price = 123.0f),
    Boardgame(numberOfPlayers = 6, minimumAge = 18, maximumAge = 100, name = "Cards against Humanity", price = 420.69f)
)

private data class Boardgame(
    val numberOfPlayers: Int,
    val minimumAge: Int,
    val maximumAge: Int,
    val name: String,
    val price: Float,
)
