package com.twsg.lnl.kotlin.c6_lazy_val.common

/**
 * @author tonyl
 */
data class Student(
        val id: String,
        val firstName: String,
        val lastName: String
) {

    val fullName: String
        get() = "$firstName $lastName"

}