package com.xunfos.comparison.kt.i_safe

import com.xunfos.comparison.kt.i_safe.Event.*

fun main() {
    processEvent(SubscribedEvent("id", "I wanna I wanna"))
    processEvent(PaidEvent("id2", 20.0))
}

private fun processEvent(event: Event) = when (event) {
    is PaidEvent -> println("Value paid ${event.valuePaid}")
    is SubscribedEvent -> println("Reason: ${event.subscriptionReason}")
}

private sealed class Event {
    abstract val eventId: String

//    data class CancellationEvent(override val eventId: String) : Event()
    data class SubscribedEvent(override val eventId: String, val subscriptionReason: String) : Event()
    data class PaidEvent(override val eventId: String, val valuePaid: Double) : Event()
}
