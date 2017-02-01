interface NumericTest {
    boolean test(int n, int m);
}

class LambdaDemo2 {
    public static void main(String args[]) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;
        
        if(isFactor.test(10, 2))
            System.out.println("2 is factor of 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 is factor of 10");
        System.out.println();
        
        NumericTest isLess = (n, m) -> (n < m);
        
        if(isLess.test(2, 10))
            System.out.println("2 is less than 10");
        if(!isLess.test(10, 3))
            System.out.println("10 is not less than 3");
        System.out.println();
        
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        
        if(absEqual.test(4, -4))
            System.out.println("Abs of 4 & -4 is equal");
        if(!absEqual.test(4, -5))
            System.out.println("Abs of 4 & -5 is not equal");
        System.out.println();
        
    }
}