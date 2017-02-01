interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

class LambdaDemo {
    public static void main(String args[]) {
        MyValue myVal;
        
        myVal = () -> 2007;
        
        System.out.println("Static value: " + myVal.getValue());
        
        MyParamValue myPVal = (n) -> 1.0 / n;
        
        System.out.println("Inverted value 4: " + myPVal.getValue(4.0));
        System.out.println("Inverted value 8: " + myPVal.getValue(8.0));
    }
}