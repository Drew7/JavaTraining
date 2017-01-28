class UseMain {
    public static void main(String args[]) {
        Thread thrd;
        
        thrd = Thread.currentThread();
        
        System.out.println("Main Thread name: " + thrd.getName());
        System.out.println("Main Thread priority: " + thrd.getPriority());
        
        System.out.println();
        
        System.out.println("Name and priority setting\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        
        System.out.println("Main Thread new name: " + thrd.getName());
        System.out.println("Main Thread new priority: " + thrd.getPriority());
    }
}