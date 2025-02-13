package datastructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

    public void printNode(Node head){
        if(head == null){
            return;
        }
        printNode(head.left);
        System.out.println(head.val);
        printNode((head.right));
    }
    public List<Integer> depthFirstSearch(Node head){
        List<Integer> treeValues = new ArrayList<>();
        if(head == null){
            return treeValues;
        }
        Stack<Node> qStack = new Stack<>();
        qStack.push(head);
        while(!qStack.isEmpty()){
            Node current = qStack.pop();
            treeValues.add(current.val);
            if(current.right != null) {
                qStack.push(current.right);
            }
            if(current.left!= null){
                qStack.push(current.left);
            }
        }
        return treeValues;
    }
    public static void main(String[] args){
        Node firstNode = new Node(5);
        Node secondNode = new Node(7);
        Node thirdNode  = new Node(8);
        Node fourthNode = new Node(10);
        Node fifthNode = new Node(11);
        firstNode.left =secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
        secondNode.right = fifthNode;
        BinaryTree tree = new BinaryTree();
        List<Integer> arr =  tree.depthFirstSearch(firstNode);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
