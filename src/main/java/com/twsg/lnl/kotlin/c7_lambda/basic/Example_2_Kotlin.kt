package com.twsg.lnl.kotlin.c7_lambda.basic

/**
 * @author tonyl
 */

fun main(args: Array<String>) {
    val names = listOf(
            "Henry",
            "Chenshu",
            "David",
            "Albert",
            "Yan Ling",
            "Daniel",
            "Tony"
    )

    names.forEach {
        println(it)
    }
}
