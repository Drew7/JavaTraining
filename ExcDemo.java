class ExcDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception");
            nums[7] = 10;
            System.out.println("Exception in previous row.");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("After catch.");
    }
}