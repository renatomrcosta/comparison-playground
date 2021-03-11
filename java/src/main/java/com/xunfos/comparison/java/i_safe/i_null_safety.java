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

    public static String getName() {
        return null;
    }

    public static Optional<String> getNameOptional() {
        return Optional.empty();
    }

    public static void printSomething(final String value) {
        System.out.println(value.substring(1));
    }
}
