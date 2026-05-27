package Main8_1;

import java.awt.*;                  
import java.awt.event.*;     
import javax.swing.*;          
import java.lang.reflect.Constructor; 

public class MainClass extends JFrame { 
    JTextField inputName;          
    JButton show;                   
    JPanel north;                
    JPanel center;                

    public static void main(String args[]) { 
        MainClass win = new MainClass(); 
    }

    public MainClass(){             
        setTitle("广告牌");        
        north = new JPanel();      
        center = new JPanel();   
        center.setLayout(new BorderLayout());  

        inputName = new JTextField("Corp",12);
        show = new JButton("显示广告"); 

        show.addActionListener(new ButtonListener()); 
        inputName.setFont(new Font("",Font.BOLD,28)); 
        show.setFont(new Font("",Font.BOLD,28)); 

        north.add(inputName);        
        north.add(show);      
        add(north,BorderLayout.NORTH); 
        add(center,BorderLayout.CENTER); 

        setVisible(true);    
        setBounds(0,0,1000,589);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    class ButtonListener implements ActionListener{ 
        public void actionPerformed(ActionEvent e) {  
            String name = inputName.getText();
            System.gc();      
            try{
                Class<?> cs = Class.forName(name);  
                Constructor<?> gouzhao = cs.getDeclaredConstructor(); 
                Corp corp = (Corp)gouzhao.newInstance(); 

                center.removeAll();   
                center.add(corp.getCorpAD()); 
                center.repaint(); 
                validate();   
            }catch(Exception exp) {  
                System.out.println(exp); 
            }
        }
    }
}
