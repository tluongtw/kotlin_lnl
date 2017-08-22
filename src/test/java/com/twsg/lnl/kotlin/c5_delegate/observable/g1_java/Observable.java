package com.twsg.lnl.kotlin.c5_delegate.observable.g1_java;

import java.util.function.BiConsumer;

/**
 * @author tonyl
 */
public class Observable<T> {

    private T value;

    private final BiConsumer<T, T> callback;

    public Observable(T initialValue, BiConsumer<T, T> callback) {
        this.value = initialValue;
        this.callback = callback;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        T oldValue = this.value;
        this.value = value;

        callback.accept(oldValue, value);
    }
}
