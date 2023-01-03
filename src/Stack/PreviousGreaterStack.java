package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static java.util.Arrays.fill;

public class PreviousGreaterStack {

    static List<Integer> PreviousGreaterElemnt(int n, int []a){
        ArrayList<Integer> ans1=new ArrayList<>();
        Stack<Integer> sd=new Stack<>();

        for (int i = 0; i <n ; i++) {
            while(!sd.isEmpty() && sd.peek()<a[i]){
                sd.pop();
            }
            if(sd.isEmpty()){
                ans1.add(-1);
            }else{
                ans1.add(sd.peek());
            }
            sd.push(a[i]);
        }

        return ans1;
    }

    public static void main(String[] args) {
        int n=3;
        int[]arr={6,4,1};
        System.out.print(PreviousGreaterElemnt(n,arr));
    }
}
