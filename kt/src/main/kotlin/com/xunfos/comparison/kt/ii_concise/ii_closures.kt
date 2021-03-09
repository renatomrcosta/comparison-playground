package com.xunfos.comparison.kt.ii_concise

fun main() {
    val fromJava = SuddenPojo().apply {
        name = "Bananinha"
    }

    SuddenPojo().run {
        //This is separate closure
        name ?: println("Well, this hasn't been initialized!")
    }
}
