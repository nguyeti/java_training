package Stack;

/**
 * Created by nguyeti on 27/06/2017.
 */

class Noeud {
    protected int data;
    protected Noeud next;

    public Noeud (int data) {
        this.data = data;
    }
}

public class StackImplementation {
    private Noeud head;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        try {
            return head.data;
        } catch (NullPointerException e) {
            System.out.println("stack is empty");
            return -1;
        }
    }

    public void push(int data) {
        Noeud node = new Noeud(data);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    // null pas vérifié
    public int pop() {
        int data = head.data;
        head = head.next;
        return data;
    }
}
