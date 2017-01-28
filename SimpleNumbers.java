class SimpleNumbers {
    public static void main(String args[]) {
        int i, j;
        boolean simple;
        
        for (i = 100000000; i <= 1000000000; i++) {
            simple = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(i);
            }
        }
    }
} 