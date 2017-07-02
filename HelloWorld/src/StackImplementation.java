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
    private Noeud top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        try {
            return top.data;
        } catch (NullPointerException e) {
            System.out.println("stack is empty");
            return -1;
        }
    }

    public void push(int data) {
        Noeud node = new Noeud(data);
        if (top != null) {
            node.next = top;
        }
        top = node;
    }

    // null pas vérifié
    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }
}
