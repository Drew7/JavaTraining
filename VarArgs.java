class VarArgs {
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contains: ");
        
        for(int i = 0; i < v.length; i++)
            System.out.println("arg" + i + ": " + v[i]);
        
        System.out.println();
    }
    
    public static void main(String args[]) {
        vaTest("One arg in array: ", 10);
        vaTest("Three arg in array: ", 10, 20, 30);
        vaTest("Zero arg in array: ");
    }
}