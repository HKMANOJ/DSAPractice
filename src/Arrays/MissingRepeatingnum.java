package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MissingRepeatingnum {
   static   int[] findTwoElement(int arr[], int n) {

        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (hm.containsKey(arr[i]))

                ans[0] = arr[i];

            else hm.put(arr[i], 1);

        }

        for (int i = 1; i <= n; i++) {

            if (hm.get(i) == null)

                ans[1] = i;

        }

        return ans;
    }

    public static void main(String[] args) {
       int N = 3;
        int Arr[] = {1,3,3};
        System.out.println(Arrays.toString(findTwoElement(Arr,N)));
    }
}

