

package lab3;


public class task2 {
    public static void main(String[] args) {
    String[] arr = {"mariam", "yousaf", "bridge", "home", "karachi"};
    for (String str : arr) {
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
            } 
        else {
            System.out.println(str + " is not a palindrome.");
            }
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
    
}
