package qpack;

public class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;
    
    public DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    
    public void put(char ch) {
        if(putloc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for(int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
    
    public void reset() {
        int newSize = q.length;
        q = new char[newSize + 1];
        putloc = getloc = 0;
    }
}