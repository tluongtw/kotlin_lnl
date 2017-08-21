package com.twsg.lnl.kotlin.c6_lazy_val.g1_vanilla;

import java.util.function.Supplier;

/**
 * @author tonyl
 */
class Lazy<T> {

    private final Supplier<T> supplier;

    private final Object valueLock = new Object();

    private T value;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (value == null) {
            synchronized (valueLock) {
                if (value == null) {
                    value = supplier.get();
                }
            }
        }

        return value;
    }
}
