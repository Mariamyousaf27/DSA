

package lab6;
public class Lab6 {
    public static void main(String[] args) {
        int[] mariam = {10, 25, 30, 15, 20};
        int key = 25;
        System.out.println("Linear Search");
        for (int j = 0; j < mariam.length; j++) {
            if (mariam[j] == key) {
                System.out.println("Element found at index : " + j);
                return;
            }
        }
        System.out.println("Element not found.");
    }
}
