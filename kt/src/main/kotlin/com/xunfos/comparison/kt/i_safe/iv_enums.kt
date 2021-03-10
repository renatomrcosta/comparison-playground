package com.xunfos.comparison.kt.i_safe

fun main() {
    processEvent(EventEnum.SUBSCRIPTION)
    processEvent(EventEnum.PAYMENT)
}

private fun processEvent(event: EventEnum) = when (event) {
    EventEnum.PAYMENT -> println("it was a payment event")
    EventEnum.SUBSCRIPTION -> println("It was a subscription even")
}

private enum class EventEnum {
    SUBSCRIPTION,
    PAYMENT
}
