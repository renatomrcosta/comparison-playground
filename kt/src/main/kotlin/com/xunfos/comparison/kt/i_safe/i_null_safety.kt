package com.xunfos.comparison.kt.i_safe

private fun getName(): String? = null
private fun printSomething(value: String): Unit {
    println(value)
}

fun main() {
    printSomething("A valid string")
    printSomething(getName() ?: "default value") // Compilation error without elvis operator!

    val name: String? = getName()
    name?.let {
        // I can add custom behavior here if I wanna!
        // But this won't run, due to the implementation above!
        printSomething(it)
    }
}
