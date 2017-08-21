package com.twsg.lnl.kotlin.c7_lambda.inline

/**
 * @author tonyl
 */

fun getStackTrace(): List<String> {
    return Thread.currentThread().stackTrace
            .drop(2)
            .map { it.methodName }
}