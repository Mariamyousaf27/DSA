

package ;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1;  
    private Queue<Integer> q2;  

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

   
    public void push(int x) {
        // Enqueue the new element into q2
        q2.offer(x);

        // Move all elements from q1 to q2 to maintain the LIFO order
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop the top element from the stack
    public int pop() {
        if (!q1.isEmpty()) {
            return q1.poll();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Get the top element without removing it
    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Check if the stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());  // Should print 30

        System.out.println("Pop element: " + stack.pop());  // Should print 30
        System.out.println("Top element after pop: " + stack.top());  // Should print 20

        System.out.println("Is stack empty? " + stack.empty());  // Should print false
        System.out.println("Pop element: " + stack.pop());  // Should print 20
        System.out.println("Pop element: " + stack.pop());  // Should print 10
        System.out.println("Is stack empty? " + stack.empty());  // Should print true
    }
}
