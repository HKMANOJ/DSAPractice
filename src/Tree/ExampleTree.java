package Tree;

import java.util.Scanner;

public class ExampleTree {
    node root = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ExampleTree tree = new ExampleTree();
        node root = createTree();
        display(root);
    }

    public static node createTree() {
        node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new node(data);
        System.out.println("enter data left for" + data);
        root.left = createTree();
        System.out.println("enter data left for" + data);
        root.right = createTree();
        return root;

    }


    public static void display(node root) {

        if (root == null) return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
}
   class node{
        node left,right;
        int data;

        public node(int data) {
            this.data=data;
        }
    }





