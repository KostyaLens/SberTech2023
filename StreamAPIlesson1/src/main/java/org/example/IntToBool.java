package org.example;
@FunctionalInterface
public interface IntToBool<T> {
    boolean applyAsBool(T a);
}
