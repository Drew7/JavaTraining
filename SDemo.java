class StaticBlock {
    static double roofOf2;
    static double roofOf3;
    
    static {
        System.out.println("In static block");
        roofOf2 = Math.sqrt(2.0);
        roofOf3 = Math.sqrt(3.0);
    }
    
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticBlock ob1 = new StaticBlock("In constructor 1");
        StaticBlock ob2 = new StaticBlock("In constructor 2");
        
        System.out.println("Root of 2: " + StaticBlock.roofOf2);
        System.out.println("Root of 3: " + StaticBlock.roofOf3);        
    }
    
}