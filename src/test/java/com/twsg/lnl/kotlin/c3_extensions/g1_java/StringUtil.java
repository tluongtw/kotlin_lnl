package com.twsg.lnl.kotlin.c3_extensions.g1_java;

import java.util.stream.IntStream;

import static com.twsg.lnl.kotlin.c3_extensions.g1_java.CharacterUtil.isVowel;

/**
 * @author tonyl
 */
public class StringUtil {

    private StringUtil() {
    }

    public static int countVowels(String value) {
        IntStream characters = value.chars();
        return (int) characters
                .filter(character ->
                        isVowel((char) character)
                )
                .count();
    }


}
