import java.awt.*;
import java.applet.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
    <applet code="CurTime" width=300 height=50>
    </applet>
*/

public class CurTime extends Applet implements Runnable {
    
    String msg = " Java rules the Web? ";
    Thread t;
    boolean stopFlag;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    public void init() {
        t = null;
    }
    
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    
    public void run() {
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(1000);
                if(stopFlag)
                    break;
            } catch(InterruptedException exc) {
                
            }
        }
    }
    
    public void stop() {
        stopFlag = true;
        t = null;
    }
    
    public void paint(Graphics g) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        msg = sdf.format(cal.getTime());
        g.drawString(msg, 50, 30);
    }
}