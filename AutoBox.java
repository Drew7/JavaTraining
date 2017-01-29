class AutoBox {
    static void m(Integer v) {
        System.out.println("m() gets " + v);
    }
    
    static int m2() {
        return 10;
    }
    
    static Integer m3() {
        return 99;
    }
    
    public static void main(String args[]) {
        m(199);
        
        Integer iOb = m2();
        System.out.println("Value from m2(): " + iOb);
        
        int i = m3();
        System.out.println("Value from m3(): " + i);
        
        iOb = 100;
        System.out.println("Square root of iOb: " + Math.sqrt(iOb));
    }
}