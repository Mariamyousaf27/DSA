
package lab3;
import java.util.Arrays;
public class Lab3 {
    public static void main(String[] args) {
        int arr1[]={0,1,2,3};
        int arr2[]={4,5,6,7};
        System.out.println("\n Before swapping ARRAY 1:");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Array 1:" + arr1[i]);
        }
    System.out.println("\n Before swapping ARRAY 2:");
    for (int i=0;i<arr2.length;i++){
        System.out.println("Array 2;" +arr2[i]);
    }
    int temp[]=arr1;
    arr1=arr2;
    arr2=temp;
    System.out.println("\n After swapping Array 1:");
    for(int i=0;i<arr1.length;i++){
        System.out.println("Array 1:"+arr1[i]);
    }
    System.out.println("After swapping Array 2:");
     for (int i=0;i<arr2.length;i++){
         System.out.println("Array 2:"+arr2[i]);
     }   
     
    
    }
}
