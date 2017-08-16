package com.twsg.lnl.kotlin.c8_singleton.g1_vanilla_eager;

/**
 * @author tonyl
 */
public class WogaaEngine {

    public static void setupEnvironment() {
        System.out.println("Setting up environment");
    }

    public static final WogaaEngine INSTANCE = new WogaaEngine();

    private WogaaEngine() {
        System.out.println("Eager initialization");
    }

    public void analyze() {
        System.out.println("Analyzing");
    }

}
