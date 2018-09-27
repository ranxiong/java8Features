package com.rx;

@FunctionalInterface
public interface Func extends NonFunc {
    void run();

    default void foo() {
        System.out.println("Func: foo");
    }

    default void voo() {
        System.out.println("Func: voo");
    }

}
