import java.io.*;
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

class Help {
    
    JList<String> jlst; 
    JLabel jlab; 
    JScrollPane jscrlp; 
 
  
    String topics[] = { "if", "switch", "for",  
                     "while", "do-while",  "break", 
                     "continue" }; 
    
    String helpfile;
    
    Help(String fname) {
        helpfile = fname;
        JFrame jfrm = new JFrame("JList Demo");  
        jfrm.setLayout(new FlowLayout());  
        jfrm.setSize(200, 160);  
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        jlst = new JList<String>(topics); 
        
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        
        jscrlp = new JScrollPane(jlst); 
        jscrlp.setPreferredSize(new Dimension(120, 90)); 
 
        jlab = new JLabel("Select topic."); 
        jlst.addListSelectionListener((le) -> jlab.setText(helpon(topics[jlst.getSelectedIndex()]))); 
        
        jfrm.add(jscrlp); 
        jfrm.add(jlab); 
  
        jfrm.setVisible(true);  
    }
    
    String helpon(String what) {
        int ch;
        String topic, info, infoAll = "<html>";
        
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = helpRdr.read();
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if(info != null) infoAll += info + "<br>";
                        } while((info != null) && (info.compareTo("") != 0));
                            return infoAll + "</html>";
                    }
                }
            } while(ch != -1);
        } catch(IOException exc) {
            return "";
        }
        return "";
    }
   
}

class SwingHelp {
    public static void main(String args[]) {
                
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } catch(Exception e) {};
        
        SwingUtilities.invokeLater(new Runnable() {  
        public void run() {  
        new Help("helpfile.txt");  
        }  
        }); 
    }
}