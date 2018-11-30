package com.example.kotlindemo

import kotlinx.coroutines.delay

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

//actual fun expectFunctionWithSuspendFunctionParameter(cb: (suspend (Any) -> Unit)): SendChannel<Any> {
//    val channel = Channel<Any>(capacity = Channel.UNLIMITED)
//    GlobalScope.launch {
//        while (true) {
//            cb.invoke(channel.receive())
//        }
//    }
//    return channel
//}