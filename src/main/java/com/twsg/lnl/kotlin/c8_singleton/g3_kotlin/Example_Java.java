package com.twsg.lnl.kotlin.c8_singleton.g3_kotlin;

/**
 * @author tonyl
 */
public class Example_Java {

    public static void main(String[] args) {
        System.out.println("Accessing class for the first time");
        WogaaEngine.setupEnvironment();

        System.out.println("Actually using the singleton instance");
        WogaaEngine.INSTANCE.analyze();
    }
}
