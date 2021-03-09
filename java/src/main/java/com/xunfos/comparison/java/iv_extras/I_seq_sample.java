package com.xunfos.comparison.java.iv_extras;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class I_seq_sample {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        final List<Integer> doubledAndPair = list.stream()
                .map(it -> {
                    System.out.println("mapping " + it);
                    return it * it;
                })
                .filter(it -> {
                    System.out.println("filtering " + it);
                    return it % 2 == 0;
                })
                .collect(Collectors.toList());

        doubledAndPair.forEach(System.out::println);
    }


}
