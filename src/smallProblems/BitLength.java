/**
 * 
 */
package smallProblems;

/**
 * @author ilkka
 * @version 18 Apr 2023
 *
 */
public class BitLength {

    
    /**
     * omputes the bit length of the non-negative integer n.
     * @param n integer
     * @return bit length
     */
    public static int bitLen(int n) {
        int bits = 1;
        if ( n == 0 ) return bits;
           
        bits = (int)(Math.log(n) / Math.log(2) + 1);
        
        return bits;
    }
    
    
    /**
     * @param args not in use
     */
    public static void main(String[] args) {
        int a = 255;
        int result = 0;
        
        result = bitLen(a);
        System.out.printf("Integer %d bit length is %d\n", a, result);
        System.out.printf("Integer %d in binary: %s\n", a, Integer.toBinaryString(a));
    
    }

}
