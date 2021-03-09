package com.xunfos.comparison.java.i_safe;

import java.util.Objects;
import java.util.Optional;

public class i_null_safety {
    public static void main(String[] args) {
        printSomething("A valid string!");

        final String name = getName();
        printSomething(Objects.requireNonNullElse(name, "default value"));

        // And now we play an optional wrapper game
        final String opt = getNameOptional().orElse("Default");
        printSomething(opt);

        //this will break on compile time!
        printSomething(getName());
    }

    private static String getName() {
        return null;
    }

    private static Optional<String> getNameOptional() {
        return Optional.empty();
    }

    private static void printSomething(final String value) {
        Objects.requireNonNull(value);
        System.out.println(value);
    }
}
