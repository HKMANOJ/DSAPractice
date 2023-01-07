package queue;

import java.util.*;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer>sd=new LinkedList<>();
        sd.offer(1);
        sd.offer(23);
        sd.offer(32);
        sd.offer(323);
        System.out.print(sd);
        System.out.println();
        while (!sd.isEmpty()){
            System.out.print(sd.remove()+" ");
        }
        Deque<Integer> sd1=new ArrayDeque<>();
        sd1.offer(32);
        sd1.offer(2);
        sd1.offer(3);
        sd1.offer(321);
        System.out.print(sd1);
        System.out.println();
        while (!sd1.isEmpty()){
            System.out.print(sd1.remove()+" ");
        }
        PriorityQueue<Integer>sdd=new PriorityQueue<>();
        sdd.add(23);
        sdd.add(32);
        sdd.add(44);
        sdd.add(11);
        sdd.add(22);
        System.out.print(sdd);
        System.out.println();
        while (!sdd.isEmpty()){
            System.out.print(sdd.remove()+" ");
        }
    }
}
