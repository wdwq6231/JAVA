package Main8_1;

import javax.swing.*;               
import java.awt.*;                

public class GXYCorp extends Corp {  
    JPanel panel;                    
    JButton enter;                 
    JTextField inputNumber;          
    JTextArea show;                  

    public GXYCorp(){                
        panel = new JPanel();        
        panel.setLayout(new BorderLayout());  

        inputNumber = new JTextField("java",15);  
        show = new JTextArea(5,18);    
        inputNumber.setFont(new Font("",Font.BOLD,28));  
        show.setFont(new Font("",Font.BOLD,28));         

        enter = new JButton("反转字符串"); 
        JPanel north = new JPanel(); 
        north.add(inputNumber); 
        north.add(enter);   

        panel.add(north,BorderLayout.NORTH);  
        panel.add(new JScrollPane(show),BorderLayout.CENTER);  

        enter.addActionListener(e -> {   
            String str = inputNumber.getText(); 
            StringBuffer buffer = new StringBuffer(str); 
            buffer = buffer.reverse();      
            show.append("\n" + buffer);      
        });
    }

    public JPanel getCorpAD(){ 
        return panel;     
    }
}
