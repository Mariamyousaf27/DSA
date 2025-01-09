

package lab6;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {20,30,40,50,70};
        int key= 40;
        int flag = binarySearch(arr, key);
        System.out.println("Binary Search");
        if (flag == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " +flag);
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high -low) / 2;
            if (arr[mid] == key) {
                return mid; 
            }
            if (arr[mid] < key) {
                low= mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }
}
