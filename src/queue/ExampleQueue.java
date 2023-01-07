package queue;

import java.util.*;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer>sd=new LinkedList<>();
        sd.offer(1);
        sd.offer(23);
        sd.offer(32);
        sd.offer(323);
        System.out.println(sd);
        Deque<Integer> sd1=new ArrayDeque<>();
        sd1.offer(32);
        sd1.offer(2);
        sd1.offer(3);
        sd1.offer(321);
        System.out.println(sd1);

    }
}
