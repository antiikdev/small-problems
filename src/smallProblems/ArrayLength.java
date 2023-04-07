/**
 * Multidimensional array lengths
 */
package smallProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antiik.dev
 * @version 25 Dec 2022
 *
 */
public class ArrayLength {

    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        // Array
        int[] array = { 0, 1, 2, 3 };
        System.out.println("One dimensional array length: " + array.length);
        
        // Two-dimensional array
        int[][] arrayDim = {
                { 0, 1 },
                { 2, 3 },
                { 4, 5 }
                };
        System.out.println("Multidimensional length rows:   " + arrayDim.length);
        System.out.println("Multidimensional length column: " +arrayDim[0].length);
        
        // ArrayList
        List<ArrayLength> lista = new ArrayList<ArrayLength>(3);
        for (int i = 0; i < 3; i++) {
            ArrayLength arr = new ArrayLength();
            lista.add(arr);
        }
        System.out.println("Size: " + lista.size());
    
    }

}
