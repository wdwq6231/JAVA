package Main8_2;

import java.awt.*;
import javax.swing.*;

public class WindowTrapezoidView extends JFrame {
    Trapezoid trapezoid;
    JTextField textTop, textBottom, textHeight;
    JTextArea showArea;
    JButton button;
    TrapezoidController controller;

    WindowTrapezoidView() {
        init(); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }

    void init() {
        trapezoid = new Trapezoid();

        textTop = new JTextField(5);    
        textBottom = new JTextField(5);  
        textHeight = new JTextField(5); 
        showArea = new JTextArea(); 
        button = new JButton("计算面积"); 

        JPanel pNorth = new JPanel();
        JLabel hintTop = new JLabel("上底:");
        JLabel hintBottom = new JLabel("下底:");
        JLabel hintHeight = new JLabel("高:");

        pNorth.add(hintTop);
        pNorth.add(textTop);
        pNorth.add(hintBottom);
        pNorth.add(textBottom);
        pNorth.add(hintHeight);
        pNorth.add(textHeight);
        pNorth.add(button);

        Font f = new Font("宋体", Font.BOLD, 28);
        hintTop.setFont(f);
        hintBottom.setFont(f);
        hintHeight.setFont(f);
        textTop.setFont(f);
        textBottom.setFont(f);
        textHeight.setFont(f);
        button.setFont(f);
        showArea.setFont(f);

        controller = new TrapezoidController();
        controller.setView(this);
        button.addActionListener(controller); 

        add(pNorth, BorderLayout.NORTH); 
        add(new JScrollPane(showArea), BorderLayout.CENTER); 
    }
}
