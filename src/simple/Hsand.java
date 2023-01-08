package simple;

import java.util.HashMap;

public class Hsand {
    static long countPairs(int n, int[] arr, int k) {
        // code here
        long count=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i%k, hm.getOrDefault(i%k,0)+1);
            count += hm.get(i%k)-1;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
