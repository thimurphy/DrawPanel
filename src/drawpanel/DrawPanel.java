/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawpanel;

/**
 *
 * @author thiagomurphy
 */

import java.awt.Graphics;
import javax.swing.JPanel;

//Class extends JPanel so that it can use JPanel inner methods
public class DrawPanel extends JPanel{
    
    //Draws an x fromhe corners of the panel
    public void paintComponent(Graphics g){
        
        //Call painComponent to unsure the panel display correctly
        super.paintComponent(g);
        
        int width = getWidth(); //total width
        int height = getHeight(); //total height
        
        //draw a line from the upper left to the lower right
        g.drawLine(0,0,width, height);
        
        //draw a line from the lower left to the upper right
        g.drawLine(0, height, width, 0);
        
        
    }//end of paintComponent method
  
    
}//end of DrawPanel calss
