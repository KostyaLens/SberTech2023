package org.example;
@FunctionalInterface
public interface ToFloatBiFunction<T> {
    Double findDiscipt(T a, T b, T c);
}
