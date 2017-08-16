package com.twsg.lnl.kotlin.c2_immutability.g1_vanilla;

import java.util.HashMap;

/**
 * @author tonyl
 */
public class Example {

    public static void main(String[] args) {
        PageStats stats = new PageStats("www.google.com", 1000, new HashMap<>());

        PageStats incrementedStats = stats.withVisitCount(stats.getVisitCount() + 1000);

        PageStats microsoftStats = stats
                .withUrl("www.microsoft.com")
                .withVisitCount(stats.getVisitCount() - 500);

        System.out.println(incrementedStats);
        System.out.println(microsoftStats);
    }
}
