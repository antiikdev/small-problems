/**
 * Powersource interface for Vehicles and Engines
 * Interfaces = "group of related methods with empty bodies."
 * Source for Java interfaces:
 * https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 */
package javaInterfaceTesting;

/**
 * @author ilkka
 * @version 5 Feb 2023
 *
 */
public interface PowerSource {

    // Following methods are required from the Engine (class)
    
    /**
     * Starts the engine
     */
    void start();
    
    
    /**
     * Stops the engine
     */
    void stop();
    
    
    /**
     * @return temperature
     */
    int temperature();
    
    
    /**
     *  @return engine status
     *  Engine ON or engine OFF
     */
    String getEngineStatus();
    
    

}
