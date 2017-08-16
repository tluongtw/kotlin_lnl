package com.twsg.lnl.kotlin.c2_immutability.g1_vanilla;

import lombok.ToString;

import java.util.Collections;
import java.util.Map;

/**
 * @author tonyl
 */
@ToString
public class PageStats {

    private final String url;

    private final int visitCount;

    private final Map<String, Integer> clickCountByElement;

    public PageStats(String url, int visitCount, Map<String, Integer> clickCountByElement) {
        this.url = url;
        this.visitCount = visitCount;
        this.clickCountByElement = Collections.unmodifiableMap(clickCountByElement);
    }

    public String getUrl() {
        return url;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public Map<String, Integer> getClickCountByElement() {
        return clickCountByElement;
    }

    public PageStats withUrl(String newUrl) {
        return new PageStats(
                newUrl,
                visitCount,
                clickCountByElement
        );
    }

    public PageStats withVisitCount(int visitCount) {
        return new PageStats(
                url,
                visitCount,
                clickCountByElement
        );
    }
}
