package Stack;

import com.sun.org.apache.xalan.internal.xsltc.dom.MatchingIterator;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Balanced_Parenthesis {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++) {

            char ch=x.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{') {

                st.push(ch);

            }

            else {

                if(st.isEmpty()) {

                    return false;

                }

                if((st.peek()=='(' && ch==')')||(st.peek()=='{' && ch=='}')||(st.peek()=='[' && ch==']') ){

                    st.pop();

                }

                else {

                    return false;

                }

            }

        }

        if(!st.isEmpty()) {

            return false;

        }

        return true;
    }


    }

