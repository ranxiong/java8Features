package com.rx;

public class TestJava8FunctionalInterface2 {
    public static void main(String[] args) {
        TestJava8FunctionalInterface2 testJava8FunctionalInterface2 = new TestJava8FunctionalInterface2();
        // lambda
        testJava8FunctionalInterface2.test(10, () -> System.out.println("A custom Func."));
        // method reference
        testJava8FunctionalInterface2.test(100, testJava8FunctionalInterface2::customFunc);
    }

    public void customFunc() {
        System.out.println("A custom method reference");
    }

    public void test(int a, Func func) {
        System.out.println(a);
        func.run();
    }
}
