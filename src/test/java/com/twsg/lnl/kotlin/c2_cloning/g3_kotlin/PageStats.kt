package com.twsg.lnl.kotlin.c2_cloning.g3_kotlin

/**
 * @author tonyl
 */
data class PageStats(val url: String,
                     val visitCount: Int,
                     val clickCountByElement: Map<String, Int> = mapOf())
