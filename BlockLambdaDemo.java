interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String args[]) {
        
        NumericFunc smallestF = (n) -> {
            int result = 1;
            
            n = n < 0 ? -n : n;
            
            for(int i = 2; i <= n / i; i++) {
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        
        System.out.println("The smallest divider 12 is " + smallestF.func(12));
        System.out.println("The smallest divider 11 is " + smallestF.func(11));
        System.out.println("The smallest divider 131 is " + smallestF.func(131));
        
    }
}