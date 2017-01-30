class NumericFns<T extends Number> {
    T num;
    
    NumericFns(T n) {
        num = n;
    }
    
    double reciprosal() {
        return 1 / num.doubleValue();
    }
    
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    
    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}

class BoundsDemo {
    public static void main(String ... args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);
        
        System.out.println("reciprosal dOb:" + dOb.reciprosal());
        System.out.println("fraction dOb:" + dOb.fraction());
        
        System.out.println("iOb & dOb comparing:");
        if(iOb.absEqual(dOb))
            System.out.println("Abs is equal.");
        else
            System.out.println("Abs is not equal.");
        
        System.out.println("iOb & lOb comparing:");
        if(iOb.absEqual(lOb))
            System.out.println("Abs is equal.");
        else
            System.out.println("Abs is not equal.");
    }
}