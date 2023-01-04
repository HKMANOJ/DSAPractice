package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    static List<Integer> NextGreaterElemnt(int n, int []a){
        List<Integer> ans1=new ArrayList<>();
            int[]ar=new int[a.length];
            ar[n-1]=-1;
        Stack<Integer> sd=new Stack<>();
       sd.push(a[n-1]);
        ans1.add(ar[n-1] );
        for (int i = n-2; i >=0; i--) {
        while(!sd.isEmpty()&& sd.peek()<=a[i]){
            sd.pop();
        }
            if(sd.isEmpty()){
                ans1.add(-1);
            }else{
                ans1.add(sd.peek());
            }
            sd.push(ar[i]);
        }

        return ans1;
        }

    public static void main(String[] args) {
        int n=3;
        int []arr={2,4,19};
        System.out.println(NextGreaterElemnt(n,arr));
    }
    }



