import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/17/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyStackTest {

    @Test
    public void testEmptyStack() {
        MyStack myStack = new MyStack();
        assertEquals(myStack.size(),0);
    }

    @Test
    public void testPushOneNewElementToStack() {
        MyStack myStack = new MyStack();
        myStack.push("abc");
        assertEquals(myStack.size(),1);
    }

    @Test
    public void testPushOneNewElementToNonZeroStack() {
        MyStack myStack = new MyStack(2);
        myStack.push("abc");
        assertEquals(myStack.size(),3);
    }

    @Test
    public void testTopOneElementFromEmptyStack() {
        MyStack myStack = new MyStack();
        assertEquals(myStack.top(),null);
    }

    @Test
    public void testPushOneElementToEmptyStackAndPopItOut() {
        MyStack myStack = new MyStack();
        myStack.push("123");
        assertEquals(myStack.top(),"123");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPopEmptyStackException() {
        MyStack myStack = new MyStack();
        myStack.pop();
    }

    @Test
    public void testPopOneElementFromANonZeroStack() {
        MyStack myStack = new MyStack(5);
        myStack.pop();
        assertEquals(myStack.size(),4);
    }

    @Test
    public void testPopOneElementFromAStackWithOnlyOneElement() {
        MyStack myStack = new MyStack(1);
        myStack.pop();
        assertEquals(myStack.size(),0);
    }

    @Test
    public void testTopAndPopToGetThisElement() {
        MyStack myStack = new MyStack();
        myStack.push("123");
        assertEquals(myStack.top(),myStack.pop());
    }
}
