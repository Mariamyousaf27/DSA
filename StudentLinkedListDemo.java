

package linkedlist;

class Student {
    int rollNo;
    String name;
    String department;
    Student next;

    
    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.next = null;
    }
}
class StudentLinkedList {
    Student head;
  
    public StudentLinkedList() {
        head = null;
    } 
    public void insertFirst(int rollNo, String name, String department) {
        Student newStudent = new Student(rollNo, name, department);
        newStudent.next = head;
        head = newStudent;
    }

    
    public void insertLast(int rollNo, String name, String department) {
        Student newStudent = new Student(rollNo, name, department);
        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
    }

    
    public void insertMiddle(int afterRollNo, int rollNo, String name, String department) {
        Student current = head;
        while (current != null && current.rollNo != afterRollNo) {
            current = current.next;
        }

        if (current != null) {
            Student newStudent = new Student(rollNo, name, department);
            newStudent.next = current.next;
            current.next = newStudent;
        } else {
            System.out.println("Student with roll number " + afterRollNo + " not found.");
        }
    }

    
    public void search(int rollNo) {
        Student current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                System.out.println("Student found: " + current.name + ", Department: " + current.department);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + rollNo + " not found.");
    }

   
    public void delete(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student with roll number " + rollNo + " deleted.");
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Student with roll number " + rollNo + " deleted.");
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    
    public void display() {
        if (head == null) {
            System.out.println("No students in the list.");
            return;
        }
        Student current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Department: " + current.department);
            current = current.next;
        }
    }
}

public class StudentLinkedListDemo {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.insertFirst(101, "mariam", "Computer Science");
        list.insertFirst(102, "yousaf", "Mechanical Engineering");
        list.insertFirst(103, "muhammad", "Electrical Engineering");
        list.insertFirst(104, "huzaifa", "Civil Engineering");
        list.insertFirst(105, "iqra", "Mathematics");
        list.insertFirst(106, "dua", "Physics");
        list.insertFirst(107, "burhan", "Chemistry");
        list.insertFirst(108, "arham", "Biology");
        list.insertFirst(109, "bisma", "Economics");
        list.insertFirst(110, "basil", "Philosophy");
     
        System.out.println("Student Records:");
        list.display();
        
        list.insertLast(111, "javeria", "Law");

      
        System.out.println("\nStudent Records after inserting at last:");
        list.display();

      
        list.insertMiddle(103, 112, "waqas", "Sociology");

       
        System.out.println("\nStudent Records after inserting in the middle:");
        list.display();

       
        list.search(106);

        
        list.search(999);

        
        list.delete(109);

       
        System.out.println("\nStudent Records after deletion:");
        list.display();
    }
}