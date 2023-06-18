package Deque;

import java.util.*;

public class find {
    public static int distributeTicket(Queue<Integer> sd,int K)
    {
        int N=sd.size();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            dq.offer(i);
        }

        boolean flag = true;
        int res  = 0;

        while(!dq.isEmpty()){
            int n = K;
            if(flag){
                while(n-->0 && !dq.isEmpty()){
                    res = dq.pollFirst();

                }
                flag = false;
            }
            else{
                while(n-->0 && !dq.isEmpty()){
                    res = dq.pollLast();
                }
                flag = true;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Queue<Integer> sd=new LinkedList<>();
        sd.add(1);
        sd.add(2);
        sd.add(3);sd.add(4);sd.add(5);
        sd.add(6);
        sd.add(7);
        sd.add(8);
        sd.add(9);
      //  System.out.printf(sd+" ");
        int k =3;

        int ans=distributeTicket(sd,k);
        System.out.printf(String.valueOf(ans));
    }
}
