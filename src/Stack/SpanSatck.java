package Stack;

import java.util.Stack;

public class SpanSatck {
    public static int[] calculateSpan(int price[], int n)
    {
        int[] span=new int[n];
        span[0]=1;
        Stack<Integer> sd=new Stack<>();

        for (int i = 1; i <price.length ; i++) {
            while(!sd.isEmpty()&&price[sd.peek()]<=price[i]){
                sd.pop();
            }
            span[i]=sd.isEmpty()? i+1:i-sd.peek();
        }
       // System.out.println(span);
        return span;
    }

    public static void main(String[] args) {
       int  N = 6;
        int price[] = {10 ,4 ,5 ,90 ,120, 80};
       calculateSpan(price,N);


    }
}
