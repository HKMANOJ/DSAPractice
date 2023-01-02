package Stack;

import java.util.Stack;

public class ReverseUsingStack {
    public static  String reverse(String S){
        //code here
        String ans="";
        Stack<Character> sd=new Stack<>();
        for(int i=0;i<S.length();i++){
            sd.push(S.charAt(i));

        }
        while(!sd.isEmpty()){
            ans+=sd.pop();
        }
        return ans;

    }

    public static void main(String[] args) {
        String name="manioj";
        System.out.println(reverse(name));
        //System.out.println(name);
    }
}
