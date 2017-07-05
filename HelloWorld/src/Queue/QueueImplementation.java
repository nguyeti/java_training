package Queue;

/**
 * Created by nguyeti on 27/06/2017.
 */

class Node {
    protected int data;
    protected Node next;

    public Node(int data){
        this.data = data;
    }
}

public class QueueImplementation {
    private Node head; // remove from the head
    private Node tail; // add things here

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    // add to the tail
    public void add(int data){
        Node node = new Node(data);
        if (tail != null){
            node.next = tail;
        }
        tail = node;
        if (head == null){
            head = node;
        }
    }

    public int remove(){
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public static void main(String[] args){
        QueueImplementation queue = new QueueImplementation();
        //queue.head = new Queue.Node(3);
        //System.out.println(queue.peek());
        queue.add(4);
        queue.add(40);
        queue.add(5);
        System.out.println(queue.head.data);
        System.out.println(queue.tail.data);
        System.out.println(queue.tail.next.data);

    }
}
