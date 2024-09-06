package de.fourteen.it.functionalvsobjectoriented.objectoriented.math;

import java.util.function.BiFunction;

public final class Modulo implements BiFunction<Integer, Integer, Integer> {

    public Integer apply(final Integer dividend, final Integer divisor) {
        return dividend % divisor;
    }

}