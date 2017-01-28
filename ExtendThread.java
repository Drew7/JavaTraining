class MyThread extends Thread {
    
    MyThread(String name) {
        super(name);
        start();
    }
    
    public void run() {
        System.out.println(getName() + " - start");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(1000);
                System.out.println("In " + getName() + ", count: " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(getName() + " - interrupted");
        }
        System.out.println(getName() + " - ended");
    }
}

class ExtendThread {
    public static void main(String ... args) {
        System.out.println("Main thread started.");
        
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread - interrupted");
            }
        } while(mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
        System.out.println("Main thread - ended");
    }
}