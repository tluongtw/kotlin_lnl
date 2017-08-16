package com.twsg.lnl.kotlin.c7_lambda.basic;

import java.util.Arrays;
import java.util.List;

/**
 * @author tonyl
 */
public class Example_1_Vanilla {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Henry",
                "Chenshu",
                "David",
                "Albert",
                "Yan Ling",
                "Daniel",
                "Tony"
        );

        names.forEach(name ->
                System.out.println(name)
        );
    }
}
