package com.twsg.lnl.kotlin.c7_lambda.inline

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * @author tonyl
 */

class Test_2_inline {

    private inline fun <T> runWithLock(lock: Lock, exec: () -> T): T {
        lock.lock()
        try {
            return exec()
        } finally {
            lock.unlock()
        }
    }

    @Test
    fun `test inline`() {
        val lock = ReentrantLock()

        val stackTrace = runWithLock(lock) {
            getStackTrace()
        }

        /* the runWithLock abstraction is completely removed from the call stack */

        assertEquals("Stack Trace",
                listOf("test inline"),
                stackTrace.take(1))
    }
}