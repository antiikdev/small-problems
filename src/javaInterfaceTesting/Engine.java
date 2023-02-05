/**
 * Engine
 * Implements PowerSource interface, and therefore
 * requires its methods
 */
package javaInterfaceTesting;

/**
 * @author ilkka
 * @version 5 Feb 2023
 *
 */
public class Engine implements PowerSource {
    
    private String status = "OFF"; // engine ON or engine OFF
    

    @Override
    public void start() {
        this.status = "ON *Brum brum brum... engine noise*";
        // System.out.println("Brum brum brum...*engine running noise*");
    }

    
    @Override
    public void stop() {
        this.status = "OFF";
    }

    
    @Override
    public int temperature() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
    /**
     * @return gets engine status
     * Engine ON orengine OFF
     */
    @Override
    public String getEngineStatus() {
        return this.status;
    }

    
    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    }


}
