package com.twsg.lnl.kotlin.c3_extensions.g1_java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyl
 */
public class StringUtilTest {

    @Test
    public void testCountVowels() throws Exception {
        assertEquals(3, StringUtil.countVowels("Jonathan"));
    }

}