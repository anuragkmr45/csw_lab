package sem4.rawDS;

public class QueueImp {
    Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

    // enqueue element in queue
    public void push(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = null;
        head = newNode;
    }

    // dequeue element in queue
    public void dequeue(int data) {

        if (head == null) {
            System.out.println("empty list");
            return;
        }

        head = head.next;
    }

    // display stack
    public void display(){
        if(head == null) {
            System.out.println("empty list");
        }

        Node currNode = head;

        while (currNode.next != null) {
            System.out.print(currNode + " --> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // size of stack
    public void size() {
        Node currNode = head;

        int count = 0;
        while (currNode.next != null) {
            count = count + 1;
        }

        System.out.println("Size of linkedlist => " + count);
    }
}
