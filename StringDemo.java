class StringDemo {
    public static void main(String args[]) {
        String str1 = new String("Strings are objects in Java.");
        String str2 = "You can create them in different ways.";
        String str3 = new String(str2);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1.length());
        
    }
}