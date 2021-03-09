package com.xunfos.comparison.kt.i_safe

private data class MyDataClass(val id: String, val name: String)

fun main() {
    val immutableString = "Cannot be changed, am final"
    var mutableString = "Change me!"
    mutableString = "I have changed!"

    //This list cannot be modified, unless I explicitly make it a mutable list, even if it is a var
    var list: List<String> = listOf("str1", "str2")

//    list.add() does not exist

    //Change a list safely
    list = list.toMutableList().map { it + "suffix" }

    //even though we ended up with a MutableList<String> after mapping, it conforms with the most strict type, keeping list as an immutable List<String> type

//    list.add() does not exist

    // I cannot reassign my data class, nor change their parameters. They are all "val"
    val dataClass = MyDataClass(id = "id1", name = "banana")
    val operatedDataClass = dataClass.copy(name = "new name!")

    // This is basically the full principle of creating builder.build(), but concise and baked in the language!
    println(dataClass)
    println(operatedDataClass)
}
