class IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;
        
        if (a < b) System.out.println("a is less than b");
        if (a == b) System.out.println("You shouldnt see this text");
        
        System.out.println();
        
        c  = b - a;
        
        System.out.println("c equal to -1");
        
        if (c >= 0) System.out.println("c is positive");
        if (c < 0) System.out.println("c is negative");
        
        System.out.println();
        
        c = b - a;
        
        System.out.println("c equal to 1");
        if (c >= 0) System.out.println("c is positive");
        if (c < 0) System.out.println("c is negative");
        
    }
}