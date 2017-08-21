@file:JvmName("CaseFactory")

package com.twsg.lnl.kotlin.c8_collections.common

/**
 * @author tonyl
 */


val case_M001 = Case("M001", Status.OPEN, "Coachroaches in the Kitchen", "Daniel")
val case_M002 = Case("M002", Status.CLOSED, "Falling Tree", "Tony")
val case_M003 = Case("M003", Status.OPEN, "Abandoned Trolley", "Peter")
val case_M004 = Case("M004", Status.IN_PROGRESS, "Abandoned Bike", "Tony")
val case_M005 = Case("M005", Status.CLOSED, "Coder without Coffee", "Daniel")
val case_M006 = Case("M006", Status.OPEN, "Test in Production", "Daniel")

val cases: List<Case> = listOf(
        case_M001,
        case_M002,
        case_M003,
        case_M004,
        case_M005,
        case_M006
)