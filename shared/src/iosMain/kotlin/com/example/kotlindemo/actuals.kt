package com.example.kotlindemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

actual suspend fun expectedSuspensionFunction() {
    delay(1)
}

actual fun getPlatformName(): String {
    return "iOS"
}

actual fun currentMillis(): Long {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun Any.className(): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun expectFunctionWithSuspendFunctionParameter(cb: (suspend (Any) -> Unit)): SendChannel<Any> {
    val channel = Channel<Any>(capacity = Channel.UNLIMITED)
    GlobalScope.launch {
        while (true) {
            cb.invoke(channel.receive())
        }
    }
    return channel
}