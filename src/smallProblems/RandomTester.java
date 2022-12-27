/**
 * 
 */
package smallProblems;

import java.util.Random;

/**
 * @author antiik.dev
 * @version 14 Nov 2022
 *
 */
public class RandomTester {

    
    /**
     * Random number between 0 and 1.0
     */
    public static void randomBetweenZeroToOne() {
        Random rand = new Random();
        double randomNumber = rand.nextDouble();
        System.out.println(randomNumber);
    }
    
    
    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        randomBetweenZeroToOne();

    
    }

}
