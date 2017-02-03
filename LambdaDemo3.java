interface StringTest {
    boolean test(String aStr, String bStr);
}

class LambdaDemo3 {
    public static void main(String args[]) {
        
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        
        String str = "This is test";
        
        System.out.println("Test string: " + str);
        
        if(isIn.test(str, "This"))
            System.out.println("'This' is found");
        else
            System.out.println("'This' is not found");
        
        if(isIn.test(str, "xyz"))
            System.out.println("'xyz' is found");
        else
            System.out.println("'xyz' is not found");
    }
}