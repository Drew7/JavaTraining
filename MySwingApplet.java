import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
    <object code="MySwingApplet" width=200 height=80>
    </object>
*/

public class MySwingApplet extends JApplet {
    JButton jbtnUp;
    JButton jbtnDown;
    
    JLabel jlab;
    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGui();
                }
            });
        } catch(Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }
    
    private void makeGui() {
               
        setLayout(new FlowLayout());
        
        setSize(220, 90);
        
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
        
        jbtnUp.addActionListener((ae) -> jlab.setText("<html><span style='font-size:16.0pt;'>You pressed Up.</span></html>"));
        jbtnDown.addActionListener((ae) -> jlab.setText("You pressed Down."));
        
        add(jbtnUp);
        add(jbtnDown);
        
        jlab = new JLabel("Press a button");
        add(jlab);
    }
    
}