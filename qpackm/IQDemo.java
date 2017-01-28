package qpackm;
import qpack.*;

public class IQDemo {
    public static void main (String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        
        ICharQ iQ;
        
        char ch;
        int i;
        
        iQ = q1;
        System.out.println(ICharQ.class);
        System.out.println(iQ.getClass());
        System.out.println(iQ);
        /*for(i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));*/
        
        try {
            for(i = 0; i < 11; i++) {
                iQ.put((char) ('A' + i));
            }
        
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        
        System.out.println("FixedQueue: ");
        
        try {
            for(i = 0; i < 12; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        
        /*for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        iQ = q2;
        
        for(i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));
        
        System.out.println("DynQueue: ");
        
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        System.out.println("\n Saving and using data of DynQueue");
        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        
        iQ = q3;
        
        for(i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));
        q3.reset();
        System.out.println("CircularQueue: ");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        
        System.out.println();
        
        for(i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));
        
        System.out.println("CircularQueue: ");
        
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        
        System.out.println("\n Saving and using data of CircularQueue");
        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }*/
    }
    
}