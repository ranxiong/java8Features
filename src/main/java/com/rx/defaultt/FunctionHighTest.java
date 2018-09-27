package com.rx.defaultt;

import java.util.function.Function;

public class FunctionHighTest {

    public static void main(String[] args) {
        // high order function
        Function<Integer, Function<Integer, Integer>> makeAdder = z -> y -> z + y;
        Integer x = 2;
        // define add1
        Function<Integer,Integer> add1 = makeAdder.apply(1);
        System.out.println("f(x)=x+1,when x="+x+", f(x)="+add1.apply(x));
        // define add5
        Function<Integer,Integer> add5 = makeAdder.apply(5);
        System.out.println("f(x)=x+5,when x="+x+", f(x)="+add5.apply(x));
    }
}
