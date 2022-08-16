/**
 * Calculates amount of heads and tails for 100 (or x number of) 
 * every 1st, 2nd, 3rd, .. 100th coins flipped around
 * 0 = tail; 1 = crown
 * Example with 10 coins when flipping every
 * > 1st, 2nd, 3th and 4th coins:
 * 1st: 1111111111
 * 2nd: 1010101010
 * 3rd: 1000111000
 * 4th: 1001111100
 */
package smallProblems;

import java.util.Arrays;

/**
 * @author www.antiik.dev
 * @version 16 Aug 2022
 *
 */
public class CoinCounter {
    
    // Number of coins you want to flip
    private static final int numberOfCoins = 100;

    
    /**
     * Prints index of coins that are crown (1)
     * @param coins stack (row) array
     */
    public static void coinNumber(int[] coins) {
        for (int i = 0; i < numberOfCoins; i++) {
            if ( coins[i] == 1 ) System.out.print(i+1 + " "); // index+1
        }
    }
    
       
    /**
     * Turns all coins to one side (head or tails)
     * @param coins stack (row) array
     */
    public static void turnAllCoins(int[] coins) {
        for (int i = 0; i < numberOfCoins; i++) {
            coins[i] = 0;
        }
    }
    
    
    /**
     * Flips recursively every N:th coin
     * @param coins to be flipped
     * @param flipNth every n:th coin flipped
     */
    public static void flipCoin(int[] coins, int flipNth) {
        // Stop recursion if the last coin has been turned
        if ( flipNth == 99 ) return;
        int n = flipNth;
        
        // Turn every N:th coin
        for (int i = 0; i < numberOfCoins; i+=n) {
            if ( coins[i] == 1 ) {
                coins[i] = 0;
            } else {
                coins[i] = 1;
            }
        }

        // Add up to next n:th
        n++;
        // Flip recursively every 2nd, 3rd, 4th, etc.
        // coin until 100th (or x number) has been turned
        flipCoin(coins, n);
    }
    
    
    /**
     * Counts number of crowns turned (i = 1) from
     * a row of coins (array)
     * @param coins array of coins
     * @return sum of coins (crowns) turned
     */
    public static int countCoins (int[] coins) {
        int sum = 0;
        for (int i = 0; i < numberOfCoins; i++) {
            if ( coins[i] == 1 ) sum++;
        }
        return sum;
    }
    
    
    /**
     * @param args not in use
     * Main for testing
     */
    public static void main(String[] args) {
        int[] coins = new int[numberOfCoins];
        turnAllCoins(coins); // initializes all coins to tails
        
        // Start flipping the coins
        int flipNth = 1;
        flipCoin(coins, flipNth);

        // Count coins turned
        int count = 0;
        count = countCoins(coins);
        
        // Print results
        System.out.println("Number of coins flipped: " + numberOfCoins);
        System.out.println("Number of crowns after flipping all: "
                + count);
        System.out.println("Row of coins 'in a table': ");
        System.out.print(Arrays.toString(coins) + "\n");
        System.out.println("Coin numbers that are crown (1): ");
        coinNumber(coins);
    }
}
