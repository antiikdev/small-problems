/**
 * Counter with Java AWT GUI
 * Source:
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html
 */
package smallProblems;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

/**
 * @author ilkka
 * @version 1 Feb 2023
 *
 */
// Inherits from the top-level container java.awt.Frame
public class LaskuriGUI extends Frame {
    
    /**
     * Private variables with default serialID (by Java)
     */
    private static final long serialVersionUID = 1L;
    private Label lblCount;    // Declare a Label component
    private TextField tfCount; // Declare a TextField component
    private Button btnCount;   // Declare a Button component
    private int count = 0;     // Counter's value
    
    
    /**
     *  Constructor to setup GUI components and event handlers
     */
    public LaskuriGUI () {
       setLayout(new FlowLayout());
          // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
          // the components from left-to-right, and flow to next row from top-to-bottom.

       lblCount = new Label("Counter");  // construct the Label component
       add(lblCount);                    // "super" Frame container adds Label component

       tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
       tfCount.setEditable(false);       // set to read-only
       add(tfCount);                     // "super" Frame container adds TextField component

       btnCount = new Button("Count");   // construct the Button component
       add(btnCount);                    // "super" Frame container adds Button component

       BtnCountListener listener = new BtnCountListener();
       btnCount.addActionListener(listener);
          // "btnCount" is the source object that fires an ActionEvent when clicked.
          // The source object adds an instance of BtnCountListener as an ActionEvent listener,
          //   which provides an ActionEvent handler called actionPerformed().
          // Clicking "Count" button calls back actionPerformed().

       setTitle("Laskuri");  // "super" Frame sets its title
       setSize(300, 100);        // "super" Frame sets its initial window size

       // For inspecting the Container/Components objects
       // System.out.println(this);
       // System.out.println(lblCount);
       // System.out.println(tfCount);
       // System.out.println(btnCount);
       setVisible(true);         // "super" Frame shows
       // System.out.println(this);
       // System.out.println(lblCount);
       // System.out.println(tfCount);
       // System.out.println(btnCount);
    }

    
    /**
     * Main method for start
     * @param args not in use
     */
    public static void main(String[] args) {
        // Invoke the constructor to setup the GUI, by allocating an instance
        LaskuriGUI app = new LaskuriGUI();
        // or simply "new LaskuriGUI;" for an anonymous instance
    }
    
    
    // Define an inner class to handle the "Count" button-click
    private class BtnCountListener implements ActionListener {
       // ActionEvent handler - Called back upon button-click.
       @Override
       public void actionPerformed(ActionEvent evt) {
          ++count; // Increase the counter value
          // Display the counter value on the TextField tfCount
          tfCount.setText(count + ""); // Convert int to String
       }
    }

}
