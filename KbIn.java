class KbIn {
    public static void main(String args[]) 
      throws java.io.IOException {
        char ch;
        
        System.out.print("Press needed key and then Enter: ");
        ch = (char) System.in.read();
        System.out.println("You just press: " + ch);
    }
}