package Deque;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> sd=new ArrayDeque<> (Arrays.asList(1,2,4,5,6,7));

        sd.stream().map(x->x*x).collect(Collectors.toSet()).stream().sorted()
                .forEach(System.out::println);

    }
}
