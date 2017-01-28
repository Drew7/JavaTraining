class MyThread implements Runnable {
    Thread thrd;
    
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count: " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - ended");
    }
}

class UseThreads {
    public static void main(String ... args) {
        System.out.println("Main thread started.");
        
        MyThread mt = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        
        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread - interrupted");
            }
        }
        System.out.println("Main thread - ended");
    }
}