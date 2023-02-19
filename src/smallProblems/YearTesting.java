/**
 * 
 */
package smallProblems;

import java.time.Year;

/**
 * @author ilkka
 * @version 18 Feb 2023
 *
 */
public class YearTesting {

    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        int year = 0;
        year = Year.now().getValue();
        System.out.println(year);
    
    }

}
