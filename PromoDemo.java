class PromoDemo {
    public static void main(String args[]) {
        byte b;
        int i;
        
        b = 10;
        i = b * b;
        b = 10;
        b = (byte) (b * b);
        
        char  chl  =  'a',  ch2  = 'b'; 
        chl  =  (char)  (chl  +  ch2); 
        
        System.out.println("i and b:" + i + " " + b);
        System.out.println("chl and ch2:" + chl + " " + ch2);
    }
}