package Stack;

public class CreateStackArray {
    int top;
    int arr[] = new int[1000];

    CreateStackArray()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        top++;
        arr[top]=a;
        // Your code here
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        //top--;
        if(top==-1){
            return top;
        }else
            return arr[top--];


        // Your code here
    }

    public static void main(String[] args) {
        CreateStackArray as=new CreateStackArray();
        as.push(1);
        System.out.println(as.hashCode());
    }
}
