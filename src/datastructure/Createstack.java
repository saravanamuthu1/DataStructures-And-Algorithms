package datastructure;

public class Createstack {
    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(100);
        stack.push(1000);
        stack.push(189);
        stack.push(45);
        stack.push(4499);
        stack.push(4753);
        System.out.println("size of the stack:"+ " " + stack.stackSize());
        System.out.println(stack.pop());
        System.out.println("size of the stack:"+ " " + stack.stackSize());
    }
}
