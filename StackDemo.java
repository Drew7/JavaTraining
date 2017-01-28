class Stack {
    private char s[];
    private int sloc;
    
    Stack(int size) {
        s = new char[size + 1];
        sloc = 0;
    }
    
    Stack(Stack ob) {
        sloc = ob.sloc;
        s = new char[ob.s.length];
        
        for(int i = 0; i <= sloc; i++)
            s[i] = ob.s[i];
    }
    
    Stack(char a[]) {
        sloc = 0;
        s = new char[a.length + 1];
        
        for(int i = 0; i < a.length; i++)
            push(a[i]);
    }
    
    void push(char ch) {
        if(sloc == s.length - 1) {
            System.out.println(" - Stack is full");
            return;
        }
        s[sloc] = ch;
        sloc++;
    }
    
    char pop() {
        if(sloc == 0) {
            System.out.println(" - Stack is empty");
            return (char) 0;
        }
        sloc--;
        return s[sloc];
    }
}

class StackDemo {
    public static void main(String args[]) {
        Stack s1 = new Stack(10);
        
        char name[] = {'D', 'r', 'e', 'w'};
        Stack s2 = new Stack(name);
        
        char ch;
        int i;
        
        for(i = 0; i < 10; i++)
            s1.push((char) ('A' + i));
        
        Stack s3 = new Stack(s1);
        
        System.out.print("s1 contains: ");
        
        for(i = 0; i < 10; i++) {
            ch = s1.pop();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("s2 contains: ");
        
        for(i = 0; i < 4; i++) {
            ch = s2.pop();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("s3 contains: ");
        
        for(i = 0; i < 10; i++) {
            ch = s3.pop();
            System.out.print(ch);
        }
        
    }
}