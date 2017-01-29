enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    
    TrafficLightColor(int d) {
        delay = d;
    }
    
    int getDelay() { return delay; }
}

class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;
    
    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        
        thrd = new Thread(this);
        thrd.start();
    }
    
    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        
        thrd = new Thread(this);
        thrd.start();
    }
    
    public void run() {
        while(!stop) {
            try {
                /*switch(tlc) {
                    case GREEN:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case YELLOW:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case RED:
                        Thread.sleep(tlc.getDelay());
                        break;
                }*/
                Thread.sleep(TrafficLightColor.values()[tlc.ordinal()].getDelay());
                
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    
    synchronized void changeColor() {
        
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify();
    }
    
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }
    
    TrafficLightColor getColor() {
        return tlc;
    }
    
    void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        
        for(int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}