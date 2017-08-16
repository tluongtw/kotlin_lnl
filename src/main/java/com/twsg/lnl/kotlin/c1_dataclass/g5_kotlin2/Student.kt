package com.twsg.lnl.kotlin.c1_dataclass.g5_kotlin2

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