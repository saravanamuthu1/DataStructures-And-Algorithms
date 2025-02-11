package datastructure;

public class Linkedlist{
    public Node head;
    public int size;

    public Linkedlist(){
        this.head = null;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList(){
        Node current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String []args){
        Linkedlist list = new Linkedlist();
        list.append(10);
        list.append(100);
        list.append(150);
        list.reverse();
        list.printList();

    }
}
