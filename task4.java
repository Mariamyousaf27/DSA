
package lab3;

public class task4 {
    public static void main(String[] args) {
       
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}    

