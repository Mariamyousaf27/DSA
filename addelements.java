package linkedlist;
import java.util.LinkedList;


public class addelements {
    public static void main(String[] args){
        
        LinkedList<String> l = new LinkedList<String>();      
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        System.out.println("Linked List: " + l);
        
       l.addFirst("Zero");
        traverseLinkedList(l);
    }
  
    public static void traverseLinkedList(LinkedList<String> list) {
        
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    
}