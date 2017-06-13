/*
 * This program shows the basic of Graphic components
 * using JPanel, Graphics and JFrame.
 */
package drawpanel;

/**
 *
 * @author thiagomurphy
 */

import javax.swing.JFrame;

public class DrawPanelTest {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancate class DrawPanel - creates an object
        DrawPanel dp = new DrawPanel();
        
        //Create a new frame to hold the panel
        JFrame application = new JFrame();
        
        //set the panel to exit when it is closed.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(dp);
        application.setSize(250,250);
        application.setVisible(true);
        
        
    }//end of main method
    
}
