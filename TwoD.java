class TwoD {
    public static void main(String args[]) {
        int t, i;
        int table[][] = new int[10][20];
        
        for(t = 0; t < 10; ++t) {
            for(i = 0; i < 20; ++i) {
                table[t][i] = (t * 20) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}