package queue;

import java.util.*;

public class MaximumSubarray {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer>list=new ArrayList<>();

        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        for (int i=k; i < n; ++i) {

            list.add(arr[dq.peek()]);

            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();

            while ((!dq.isEmpty())
                    && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }

        list.add(arr[dq.peek()]);

        return list;
    }

    public static void main(String[] args) {
        int k=3;
        int n=6;
        int[] arr={2,4,5,3,6,8};
        System.out.println(max_of_subarrays(arr,n,k));
    }
}
