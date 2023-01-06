package Stack;

import java.util.Stack;

public class ReverseSentance {
    static String reverseWords(String S)
    {
        // your code here
        Stack<String> s = new Stack<String>();

        String temp = "";

        String ans = "";
        for (int i =0; i<S.length(); i++){



            if(S.charAt(i)=='.'){

                s.push(temp);

                temp = "";

                temp = temp +'.';

                s.push(temp);

                temp = "";

            }

            else

                temp = S.charAt(i)+temp ;

        }

        s.push(temp);

        temp = "";

        while(!s.isEmpty()){

            ans = s.pop()+ans;

        }

        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("i.manoj"));

    }
}
