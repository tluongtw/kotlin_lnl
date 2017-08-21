package com.twsg.lnl.kotlin.c7_lambda.basic.g1_java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyl
 */
public class StringSortUtilTest {

    @Test
    public void test_sortByConsonantCount() throws Exception {
        List<String> names = Arrays.asList(
                "Henry",
                "Chenshu",
                "David",
                "Albert",
                "Yan Ling",
                "Daniel",
                "Tony"
        );

        List<String> sorted = Arrays.asList(
                "Daniel",
                "Albert",
                "Chenshu",
                "David",
                "Yan Ling",
                "Henry",
                "Tony"
        );

        assertEquals(sorted, StringSortUtil.sortByVowelCount(names));
    }

}