package geeksForgekksDailyChallange;

import java.util.PriorityQueue;

public class Day12 {
    static long minimizeSum(int N, int arr[]) {
        // code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(arr[i]);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            sum += a + b;
            pq.add(a + b);
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 4;
       int arr[] = {1, 4, 7, 10};
        System.out.println(minimizeSum(N,arr));
    }
}
