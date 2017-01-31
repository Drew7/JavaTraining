class Summation {
    private int sum;
    <T extends Number> Summation(T arg) {
        sum = 0;
        for(int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }
    
    int getSum() {
        return sum;
    }
}

class GenConsDemo {
    public static void main(String args[]) {
        Summation newSum = new Summation(1596.56);
        System.out.println("Sum of all integers from 1 to 1596: " + newSum.getSum());
    }
}