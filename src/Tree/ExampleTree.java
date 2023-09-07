package Tree;

import java.util.Scanner;

public class ExampleTree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    createTree();
    }

    static node createTree() {
        node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new node(data);
        System.out.println("enter data left");
        root.left = createTree();
        System.out.println("enter data right");
        root.right = createTree();
        return root;
    }
}
   class node{
        node left,right;
        int data;

        public node(int data) {
            this.data=data;
        }
    }


//    static void inOederTreversal(node root){
//        inOederTreversal(root.left);
//        System.out.println(root.data);
//        inOederTreversal(root.left);
//    }


