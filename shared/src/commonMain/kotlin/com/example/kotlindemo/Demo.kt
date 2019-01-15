package com.example.kotlindemo

import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.delay


expect fun expectFunctionWithSuspendFunctionParameter(cb: (suspend (Any) -> Unit)): SendChannel<Any>
private val act: SendChannel<Any> = expectFunctionWithSuspendFunctionParameter({(::receiveEvent)(it)})

suspend fun receiveEvent(event: Any) {
    delay(1)
}

expect fun currentMillis(): Long

expect fun Any.className(): String

expect suspend fun expectedSuspensionFunction()

expect fun getPlatformName(): String
