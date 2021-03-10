package com.xunfos.comparison.kt.ii_concise

fun main() {
    val matches = """
        Manana asd
        asd Banana
        coffee asd spilled
    """.trimIndent() matches "n.*na".toRegex()

    println(matches)

    val list = BOARDGAME_LIST whereCostsMoreThan 100.0
    list.onEach { println(it) }

    val pair = 12 to "Time"

    val map = mapOf(
        0 to "Banana",
        1 to "Apple"
    )
}

private infix fun List<Boardgame>.whereCostsMoreThan(price: Double)
= this.filter { it.price > price }
