/**
 * 
 */
package javaInterfaceTesting;

import java.util.Scanner;


/**
 * @author ilkka
 * @version 5 Feb 2023
 *
 */
public class Car {

    private static PowerSource eng;
    
    
    /**
     * Set engine
     * @param e engine to be set
     */
    public void setEng(PowerSource e) {
        eng = e;
    }
    
    
    /**
     * Starts the engine
     */
    public void run() {
        eng.start();
    }
    
    
    /**
     * Stops the engine
     */
    public void stop() {
        eng.stop();
    }
    
    
    /**
     * Clear command line screen (Java)
     * Method from Youtube channel "Ubuntu Tricks", Stackoverflow "J. Bosboom"
     * Note: Clear console method 'cls' works in command line,
     * but not in Eclipse
     */
    public static void cls() {
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
    }
    
    
    /**
     * Menu User Interface
     * @param vehicle to add cars or trucks
     * @return boolean true if continue, false if exit
     */
    public static boolean driverSeatControls(Car vehicle) {
        // Clear screen
        cls();
        
        // Print counts
        System.out.println("Engine: " + eng.getEngineStatus());
        System.out.print("Press 1 to start the car, 2 to stop,"
                + " 3 to exit the car >");

        // Scan selection
        Scanner scan = new Scanner(System.in);
        
        // Selection
        switch (scan.nextLine()) {
            case "1":
                vehicle.run();
                cls();
                break;
            
            case "2":
                vehicle.stop();
                cls();
                break;
            
            case "3": return false;
    
            default:
                cls();
                return true;
        }
        return true;
    }
    
    
    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        // Buy a car with an engine
        Car Toyota = new Car();
        Engine fourCylinder = new Engine();
        Toyota.setEng(fourCylinder);
        
        // Step into the car (with engine)
        boolean menu = true;
        while(menu) {
            menu = driverSeatControls(Toyota);
        }
    
    }

}
