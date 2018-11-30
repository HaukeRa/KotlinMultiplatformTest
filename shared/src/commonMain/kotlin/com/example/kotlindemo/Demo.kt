package com.example.kotlindemo


//expect fun expectFunctionWithSuspendFunctionParameter(cb: (suspend (Any) -> Unit)): SendChannel<Any>
//private val act: SendChannel<Any> = expectFunctionWithSuspendFunctionParameter(::receiveEvent)
//
//suspend fun receiveEvent(event: Any) {
//    delay(1)
//}

expect fun currentMillis(): Long

expect fun Any.className(): String

expect suspend fun expectedSuspensionFunction()

expect fun getPlatformName(): String
