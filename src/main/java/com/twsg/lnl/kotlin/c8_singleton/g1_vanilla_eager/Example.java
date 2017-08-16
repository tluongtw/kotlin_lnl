package com.twsg.lnl.kotlin.c8_singleton.g1_vanilla_eager;

/**
 * @author tonyl
 */
public class Example {

    public static void main(String[] args) {
        System.out.println("Accessing the class for the first time");
        WogaaEngine.setupEnvironment();

        System.out.println("Actually using the singleton instance");
        WogaaEngine.INSTANCE.analyze();
    }
}