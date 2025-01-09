

package linkedlist;

public class NewClass {
    class Node {
    int data;
    Node next;

   
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;  

   
    public LinkedList() {
        this.head = null;
    }

   
    public boolean isEmpty() {
        return head == null; 
    }

    
    public void append(int data) {
        Node newNode = new Node(data);  
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;  
        }
    }

    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

       
        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
        list.append(10);
        list.append(20);
        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
        list.printList();
    }
}
    

