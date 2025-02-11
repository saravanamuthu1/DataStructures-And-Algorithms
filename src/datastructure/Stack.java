package datastructure;

public class Stack {
    private int[] stack;
    private int top;
    private int size;
    public Stack(int size){
        stack = new int[size];
        top = 0;
        this.size = size;
    }
    public void push(int data){
        if(top==size) {
            resize();
        }
            stack[top] = data;
            top++;
    }
    public void resize(){
        int size = this.size * 2;
        int[] newstack = new int[size];
        for(int i = 0; i < top; i++){
            newstack[i] = stack[i];
        }
        stack = newstack;
        this.size = size;
    }
    public int stackSize(){
        return top;
    }

    public int pop(){
        if(top == 0){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            top--;
            int data;
            data = stack[top];
            stack[top] = 0;
            return data;
        }
    }
}
