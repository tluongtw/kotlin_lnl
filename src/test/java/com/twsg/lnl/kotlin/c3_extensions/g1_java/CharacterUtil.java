package com.twsg.lnl.kotlin.c3_extensions.g1_java;

/**
 * @author tonyl
 */
public class CharacterUtil {

    private CharacterUtil() {
    }

    public static boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
                return true;
            default:
                return false;
        }
    }
}
