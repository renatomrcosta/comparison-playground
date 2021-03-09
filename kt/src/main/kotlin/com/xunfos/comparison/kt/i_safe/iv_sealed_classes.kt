package com.xunfos.comparison.kt.i_safe

fun main() {
    processEvent(Event.SubscribedEvent("id", "I wanna I wanna"))
    processEvent(Event.PaidEvent("id2", 20.0))
}

private fun processEvent(event: Event) = when (event) {
    is Event.PaidEvent -> println("Value paid ${event.valuePaid}")
    is Event.SubscribedEvent -> println("Reason: ${event.subscriptionReason}")
}

private sealed class Event {
    abstract val eventId: String

    data class SubscribedEvent(override val eventId: String, val subscriptionReason: String) : Event()
    data class PaidEvent(override val eventId: String, val valuePaid: Double) : Event()
}
