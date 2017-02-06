import java.awt.*;
import java.applet.*;
/*
    <applet code="Param" width=500 height=160>
    <param name=author value="Herb Schildt">
    <param name=purpose value="Demonstrate Parameters">
    <param name=version value=2>
    </applet>
*/

public class Param extends Applet {
    String author;
    String purpose;
    int ver;
    
    public void start() {
        String temp;
        
        author = getParameter("author");
        if(author == null) author = "not found";
        
        purpose = getParameter("purpose");
        if(purpose == null) author = "not found";
        
        temp = getParameter("version");
        try {
            if(temp != null)
                ver = Integer.parseInt(temp);
            else
                ver = 0;
        } catch(NumberFormatException exc) {
            ver = -1;
        }
    }
    
    public void paint(Graphics g) {
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
        g.drawString("URL: " + getCodeBase(), 10, 80);
        g.drawString("URL: " + getDocumentBase(), 10, 100);
        g.drawString("Locale: " + getLocale(), 10, 120);
        resize(600, 200);
    }
}