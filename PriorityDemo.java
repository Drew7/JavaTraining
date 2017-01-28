class Priority implements Runnable {
    int count;
    Thread thrd;
    
    static boolean stop = false;
    static String currentName;
    
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }
    
    public void run() {
        System.out.println(thrd.getName() + " - start");
        do {
            count++;
            
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 1000000000);
        stop = true;
        
        System.out.println("\n" + thrd.getName() + " - end");
    }
}

class PriorityDemo {
    public static void main(String args[]) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 5);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 4);
        
        System.out.println("\nPriority of High Priority thread: " + mt1.thrd.getPriority());
        System.out.println("\nPriority of Low Priority thread: " + mt2.thrd.getPriority());
        
        mt1.thrd.start();
        mt2.thrd.start();
        
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interruption");
        }
        System.out.println("\nCounter of High Priority thread: " + mt1.count);
        System.out.println("\nCounter of Low Priority thread: " + mt2.count);
    }
}