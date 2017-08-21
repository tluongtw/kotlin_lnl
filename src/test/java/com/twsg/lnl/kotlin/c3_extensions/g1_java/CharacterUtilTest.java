package com.twsg.lnl.kotlin.c3_extensions.g1_java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyl
 */
@RunWith(Parameterized.class)
public class CharacterUtilTest {

    @Parameters
    public static Object[][] params() {
        return new Object[][]{
                {'A', true},
                {'a', true},
                {'E', true},
                {'e', true},
                {'U', true},
                {'u', true},
                {'I', true},
                {'i', true},
                {'O', true},
                {'o', true},
                {'B', false},
                {'c', false},
                {'D', false},
        };
    }

    @Parameter(0)
    public char testChar;

    @Parameter(1)
    public boolean expectedVowel;

    @Test
    public void isVowel() throws Exception {
        assertEquals(expectedVowel, CharacterUtil.isVowel(testChar));
    }

}