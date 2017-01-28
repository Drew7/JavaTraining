class Queue {
    private char q[];
    private int putloc, getloc;
    
    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        
        for(int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        
        for(int i = 0; i < a.length; i++)
            put(a[i]);
    }
    
    void put(char ch) {
        if(putloc == q.length - 1) {
            System.out.println(" - Queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
        getloc++;
        return q[getloc];
    }
}

class QDemo2 {
    public static void main(String args[]) {
        Queue q1 = new Queue(10);
        
        char name[] = {'D', 'r', 'e', 'w'};
        Queue q2 = new Queue(name);
        
        char ch;
        int i;
        
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));
        
        Queue q3 = new Queue(q1);
        
        System.out.print("q1 contains: ");
        
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("q2 contains: ");
        
        for(i = 0; i < 4; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("q3 contains: ");
        
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        
    }
}