import javax.swing.*;
import java.awt.BorderLayout;

class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("A Simple Swing App");
        
        jfrm.setSize(275, 100);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jlab = new JLabel("Swing defines modern Java GUI?");
        
        JButton jbtn = new JButton("Try to make btn.");
        JButton jbtn2 = new JButton("Try to make btn.2");
        
        jfrm.add(jlab, BorderLayout.NORTH);
        jfrm.add(jbtn, BorderLayout.EAST);
        jfrm.add(jbtn2, BorderLayout.WEST);
        
        jfrm.setVisible(true);
    }
    
    public static void main(String args[]) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}