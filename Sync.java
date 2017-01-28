class SumArray {
    private int sum;
    
    int sumArray(int nums[]) {
        sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Current sum for " + Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10);
            } catch(InterruptedException exc) {
                System.out.println("Main thread interruption");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;
    
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }
    
    public void run() {
        int sum;
        
        System.out.println(thrd.getName() + " - start");
        
        synchronized(sa) {
            answer = sa.sumArray(a);
        }
        
        System.out.println("Sum for " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - end");
    }
}

class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        
        MyThread mt1 = new MyThread("Child #1", a);
        MyThread mt2 = new MyThread("Child #2", a);
    }
}