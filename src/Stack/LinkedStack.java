package Stack;

public class LinkedStack {
    StackNode top;

    class StackNode
    {
             int data;
        StackNode next;
             StackNode(int a) {
                 data = a;
                 next = null;
             }

    }
    void push(int a)
    {
        // Add your code here
        StackNode temp=new StackNode(a);
        temp.next=top;
        top=temp;

    }
    void  display()
    {
        StackNode temp=top;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedStack sd=new LinkedStack();
        sd.push(12);
        sd.push(22);
        sd.push(33);
        sd.push(21);

        sd.display();
    }
}
