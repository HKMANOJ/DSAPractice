package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        //  Deque<Integer> ad= new ArrayDeque<>();
        Stack<Integer> sd=new Stack<>();
        while(!q.isEmpty()){
            sd.push(q.poll());
        }
        while(!sd.isEmpty())
        {
            q.add(sd.pop());
        }

        return q;
    }

    public static void main(String[] args) {
       Queue<Integer> arr=new ArrayDeque<>();
       arr.add(23);
       arr.add(33);
       arr.add(21);
       arr.add(2);
       arr.add(12);
        System.out.println(rev(arr));
    }
}
