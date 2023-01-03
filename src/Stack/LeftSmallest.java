package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeftSmallest {
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        List<Integer> df=new ArrayList<>();

        // int[] span=new int[n];
        // span[0]=-1;
        Stack<Integer> sd=new Stack<>();

        for(int i=0;i<n;i++){
            while(!sd.isEmpty() && sd.peek()>=a[i]){
                sd.pop();
            }
            if(sd.isEmpty()){
                df.add(-1);
            }else{
                df.add(sd.peek());
            }
            sd.push(a[i]);
        }

        return df;
    }

    public static void main(String[] args) {
        int n=3;
        int[] arr={
                2,4,6
        };
        System.out.println(leftSmaller(n,arr));

    }
}
