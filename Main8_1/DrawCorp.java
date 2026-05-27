package Main8_1;

import javax.swing.JPanel;    
import java.awt.*;       
import java.awt.event.*;      

public class DrawCorp extends Corp {  
    public JPanel getCorpAD(){    
        DrawingBoard panel = new DrawingBoard();  
        return panel;     
    }
}

class DrawingBoard extends JPanel{ 
    Toolkit tool;     
    Image image1, image2;    

    DrawingBoard(){ 
        setBackground(Color.yellow); 
        tool = getToolkit();  
        image1 = tool.getImage("one.jpg"); 
        image2 = tool.getImage("two.jpg"); 
    }

    public void paint(Graphics g){  
        super.paint(g);             
        g.setXORMode(Color.red); 

        int w = getBounds().width;
        int h = getBounds().height; 

        g.drawImage(image1,0,0,w,h,this); 
        g.drawImage(image2,0,0,w,h,this); 
    }
}
