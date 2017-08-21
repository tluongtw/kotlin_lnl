package com.twsg.lnl.kotlin.c7_lambda.basic.g1_java;

import com.twsg.lnl.kotlin.c3_extensions.g1_java.StringUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author tonyl
 */
public class StringSortUtil {

    public static List<String> sortByVowelCount(List<String> input) {
        Comparator<String> comparatorByVowelCount = Comparator
                .comparingInt(StringUtil::countVowels)
                .reversed()
                .thenComparing(Comparator.naturalOrder());

        ArrayList<String> sorted = new ArrayList<>(input);
        sorted.sort(comparatorByVowelCount);

        return sorted;
    }

}
