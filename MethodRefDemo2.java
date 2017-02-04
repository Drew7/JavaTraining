interface IntPredicate {
    boolean test(int n);
}

interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}

class MyIntNum {
    private int v;
    
    MyIntNum(int x) { v = x; }
    
    int getNum() { return v; }
    
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo2 {
    
    public static void main(String args[]) {
        boolean result;
        
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        
        IntPredicate ip = myNum::isFactor;
        
        result = ip.test(3);
        if(result) System.out.println("3 is divider of: " + myNum.getNum());
        
        ip = myNum2::isFactor;
        
        result = ip.test(3);
        if(!result) System.out.println("3 is not divider of: " + myNum2.getNum());
        
        MyIntNumPredicate inp = MyIntNum::isFactor;
        
        result = inp.test(myNum, 3);
        if(result) System.out.println("3 is divider of: " + myNum.getNum());
        
        result = inp.test(myNum2, 3);
        if(!result) System.out.println("3 is not divider of: " + myNum2.getNum());
    }
}

