package com.twsg.lnl.kotlin.c2_cloning.g2_lombok;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Wither;

import java.util.Collections;
import java.util.Map;

/**
 * @author tonyl
 */
@ToString
@Getter
@Wither /* experimental */
public class PageStats {

    private final String url;

    private final int visitCount;

    private final Map<String, Integer> clickCountByElement;

    public PageStats(String url, int visitCount, Map<String, Integer> clickCountByElement) {
        this.url = url;
        this.visitCount = visitCount;
        this.clickCountByElement = Collections.unmodifiableMap(clickCountByElement);
    }

}
