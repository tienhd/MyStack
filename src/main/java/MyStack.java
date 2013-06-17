import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/17/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyStack {
    public int size;
    public ArrayList<String> myStackData;
    public MyStack() {
        size = 0;
        myStackData = new ArrayList<String>();
    }

    public MyStack(int i) {
        size = i;
        myStackData = new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            myStackData.add(null);
        }
    }

    public int size() {
        return this.size;
    }

    public void push(String data) {
        myStackData.add(data);
        size++;
    }

    public String top() {
        if (this.size() == 0) {
            return null;
        }
        else {
            return myStackData.get(0);
        }
    }

    public String pop() {
        if (this.size == 0) {
            throw new IllegalArgumentException();
        }
        String myString = myStackData.get(this.size-1);
        myStackData.remove(this.size-1);
        this.size --;
        return myString;
    }
}
