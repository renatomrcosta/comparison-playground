package com.xunfos.comparison.kt.ii_concise


fun main() {
    val sum = BOARDGAME_LIST
        .moreThanTwoPlayers()
        .olderThanTenToPlay()
        .sumOf { it.price }

    println("Sum was $sum")
}

private fun List<Boardgame>.moreThanTwoPlayers(): List<Boardgame> = filter { it.numberOfPlayers >= 2 }
private fun <T: Boardgame> List<T>.olderThanTenToPlay(): List<T> = filter { it.minimumAge >= 10 }


private val BOARDGAME_LIST = listOf(
    Boardgame(numberOfPlayers = 2, minimumAge = 10, maximumAge = 99, name = "Bohnanza", price = 123.0),
    Boardgame(numberOfPlayers = 6, minimumAge = 18, maximumAge = 100, name = "Cards against Humanity", price = 420.69)
)

private data class Boardgame(
    val numberOfPlayers: Int,
    val minimumAge: Int,
    val maximumAge: Int,
    val name: String,
    val price: Double,
)
