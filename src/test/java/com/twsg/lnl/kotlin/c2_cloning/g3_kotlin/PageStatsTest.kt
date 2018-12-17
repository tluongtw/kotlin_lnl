package com.twsg.lnl.kotlin.c2_cloning.g3_kotlin

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotSame
import org.junit.Test
import java.util.*

/**
 * @author tonyl
 */
class PageStatsTest {

    @Test
    fun `copying with visitCount should return correct result`() {
        val stats = PageStats("www.google.com", 1000, HashMap())

        // `copy` comes with data classes

        val incrementedStats = stats.copy(visitCount = stats.visitCount + 1000)

        assertNotSame(stats, incrementedStats)
        assertEquals(stats.url, incrementedStats.url)
        assertEquals(2000, incrementedStats.visitCount.toLong())
    }

    @Test
    fun `copying with URL should return correct result`() {
        val stats = PageStats("www.google.com", 1000, HashMap())

        val incrementedStats = stats.copy(url = "www.microsoft.com")

        assertNotSame(stats, incrementedStats)
        assertEquals(stats.visitCount, incrementedStats.visitCount)
        assertEquals("www.microsoft.com", incrementedStats.url)
    }
}
