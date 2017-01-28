class NotDemo {
    public static void main(String args[]) {
        byte b = -34;
        System.out.println(b);
        for(int t = 128; t > 0; t = t / 2){
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        
        b = (byte) ~b;
        System.out.println(b);
        for(int t = 128; t > 0; t = t / 2){
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        
        int newb = 2007;
        System.out.println(newb);
        for(long t = 2147483648L; t > 0; t = t / 2){
            if((newb & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        
        newb = (int) ~newb;
        System.out.println(newb);
        for(long t = 2147483648L; t > 0; t = t / 2){
            if((newb & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        
         
    }
}