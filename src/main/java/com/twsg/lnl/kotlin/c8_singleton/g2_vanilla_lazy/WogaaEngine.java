package com.twsg.lnl.kotlin.c8_singleton.g2_vanilla_lazy;

/**
 * @author tonyl
 */
public class WogaaEngine {

    public static void setupEnvironment() {
        System.out.println("Setting up environment");
    }

    private static WogaaEngine instance;

    public static WogaaEngine getInstance() {
        if (instance == null) {
            synchronized (WogaaEngine.class) {
                if (instance == null) {
                    instance = new WogaaEngine();
                }
            }
        }
        return instance;
    }


    private WogaaEngine() {
        System.out.println("Lazy initialization");
    }

    public void analyze() {
        System.out.println("Analyzing");
    }
}
