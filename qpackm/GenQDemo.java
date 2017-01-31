package qpackm;
import qpack.*;

public class GenQDemo {
    public static void main (String args[]) {
        Integer iStore[] = new Integer[10];
        
        GenFixedQueue<Integer> q = new GenFixedQueue<Integer>(iStore);
        
        Integer iVal;
        
        try {
            for(int i = 0; i < 5; i++) {
                q.put(i);
            }
        
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        
        System.out.println("FixedQueue: ");
        
        try {
            for(int i = 0; i < 15; i++) {
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        
               
        System.out.println();
        
        
        Double dStore[] = new Double[10];
        
        GenFixedQueue<Double> d = new GenFixedQueue<Double>(dStore);
        
        Double dVal;
        
        try {
            for(int i = 0; i < 12; i++) {
                d.put((double)i/2);
            }
        
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        
        System.out.println("FixedQueue: ");
        
        try {
            for(int i = 0; i < 10; i++) {
                dVal = d.get();
                System.out.println(dVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        
               
        System.out.println();
        
        
    }
    
}