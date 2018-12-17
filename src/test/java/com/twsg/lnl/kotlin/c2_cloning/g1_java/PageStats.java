package com.twsg.lnl.kotlin.c2_cloning.g1_java;

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

    /**
     * Create a new instance of this with all properties set to the existing one except from url.
     */
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
