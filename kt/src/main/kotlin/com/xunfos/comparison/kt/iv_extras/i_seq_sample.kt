package com.xunfos.comparison.kt.iv_extras

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    sequenceCollection()
    coroutineCollection()
}

fun sequenceCollection() {
    val doubledAndPair = (1..10)
        .asSequence()
        .map {
            println("Mapping $it")
            it * it
        }
        .filter {
            println("Filtering $it")
            it % 2 == 0
        }

    doubledAndPair.forEach(::println)
}

fun coroutineCollection() {
    val doubledAndPair = (1..10)
        .asFlow()
        .map {
            println("Mapping $it")
            it * it
        }
        .filter {
            println("Filtering $it")
            it % 2 == 0
        }

    runBlocking {
        doubledAndPair.collect(::println)
    }
}
