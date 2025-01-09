

package stackusingqueue;
import java.util.LinkedList;
import java.util.Queue;
class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }   
    public void push(int data) {
        queue1.offer(data);
    }    
    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }       
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }     
        int poppedItem = queue1.poll();      
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedItem;
    }   
    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

       
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topItem = queue1.peek();
        queue2.offer(queue1.poll());
               Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topItem;
    }    
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(46);
        stack.push(94);
        stack.push(30);
        System.out.println("Top of the stack: " + stack.top());
        System.out.println("Popped element: " + stack.pop());  
        System.out.println("Top of the stack after pop: " + stack.top());  
        System.out.println("Is stack empty? " + stack.isEmpty());  
    }
}


