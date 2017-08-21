package com.twsg.lnl.kotlin.c7_lambda.inline

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * @author tonyl
 */

class Test_1_noinline {

    private fun <T> runWithLock(lock: Lock, exec: () -> T): T {
        lock.lock()
        try {
            return exec()
        } finally {
            lock.unlock()
        }
    }

    @Test
    fun `test noinline`() {
        val lock = ReentrantLock()

        val stackTrace = runWithLock(lock) {
            getStackTrace()
        }

        assertEquals("Stack Trace",
                listOf("invoke", "invoke", "runWithLock", "test noinline"),
                stackTrace.take(4))
    }
}