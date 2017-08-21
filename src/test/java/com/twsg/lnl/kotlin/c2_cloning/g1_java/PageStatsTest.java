package com.twsg.lnl.kotlin.c2_cloning.g1_java;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * @author tonyl
 */
public class PageStatsTest {

    @Test
    public void withVisitCount_should_return_correct_result() {
        PageStats stats = new PageStats("www.google.com", 1000, new HashMap<>());

        PageStats incrementedStats = stats.withVisitCount(stats.getVisitCount() + 1000);

        assertNotSame(stats, incrementedStats);
        assertEquals(stats.getUrl(), incrementedStats.getUrl());
        assertEquals(2000, incrementedStats.getVisitCount());
    }

    @Test
    public void withUrl_should_return_correct_result() {
        PageStats stats = new PageStats("www.google.com", 1000, new HashMap<>());

        PageStats incrementedStats = stats.withUrl("www.microsoft.com");

        assertNotSame(stats, incrementedStats);
        assertEquals(stats.getVisitCount(), incrementedStats.getVisitCount());
        assertEquals("www.microsoft.com", incrementedStats.getUrl());
    }
}
