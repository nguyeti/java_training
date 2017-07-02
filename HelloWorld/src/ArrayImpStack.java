/**
 * Created by nguyeti on 26/06/2017.
 */
class StackObj {
    private int top;
    private int[] array;

    public StackObj(int arraySize){
        this.top = -1;
        this.array = new int[arraySize];

    }

    public void showArray() {
        for (Integer i: array){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public void push(int value){
        if (top < array.length) {
            top++;
            array[top] = value;
        }
    }

    public void pop(){
        if (!(top < 0)) {
            array[top] = 0;
            top--;
        }
        else {
            System.out.println("Nothing to pop!");
        }
    }

    public void top () {
        System.out.println(array[top]);
    }

    public boolean isEmpty (){
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class ArrayImpStack {

    private static int top = -1;

    public static void main(String[] args) {
        StackObj s = new StackObj(5);
        s.showArray();
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(5);
        s.push(6);
        s.showArray();
        s.top();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
