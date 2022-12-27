/**
 * 
 */
package smallProblems;

import java.util.Arrays;

/**
 * @author ilkka
 * @version 27 Dec 2022
 *
 */
public class ArraySort {

    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        int[] arr = { 40, 24, 124, 1, 4 };
        
        System.out.print("Array unsorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
        System.out.print("\nArray is sorted: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
