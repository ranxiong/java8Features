package com.rx;

public class TestJava8FunctionalInterface implements Func {
    public static void main(String[] args) {
        Func func = new TestJava8FunctionalInterface();
        func.run();
        func.foo();
        func.voo();
    }
    @Override
    public void run() {
        System.out.println("TestJava8FunctionalInterface: run");
    }

    @Override
    public void foo() {
        System.out.println("TestJava8FunctionalInterface: foo");
    }

    @Override
    public void voo() {
        System.out.println("TestJava8FunctionalInterface: voo");
    }
}
