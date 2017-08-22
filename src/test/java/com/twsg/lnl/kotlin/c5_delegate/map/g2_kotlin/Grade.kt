package com.twsg.lnl.kotlin.c5_delegate.map.g2_kotlin

/**
 * @author tonyl
 */

class Grade(private val gradeMap: MutableMap<String, Double>) {

    var math by gradeMap

    var physics by gradeMap

}