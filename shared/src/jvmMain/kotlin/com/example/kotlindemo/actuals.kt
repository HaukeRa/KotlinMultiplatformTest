package com.example.kotlindemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay


actual fun getPlatformName(): String {
    return "Android"
}

actual suspend fun expectedSuspensionFunction() {
    delay(1)
}

actual fun expectFunctionWithSuspendFunctionParameter(cb: (suspend (Any) -> Unit)): SendChannel<Any> {
    return GlobalScope.actor(capacity = Channel.UNLIMITED) {
        consumeEach {
            cb.invoke(it)
        }
    }
}

actual fun currentMillis(): Long {
    return System.currentTimeMillis()
}

actual fun Any.className(): String {
    return this.javaClass.simpleName
}