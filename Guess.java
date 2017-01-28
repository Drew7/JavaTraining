class Guess {
    public static void main(String args[]) throws java.io.IOException {
        char ch, ignore, answer = 'S';
        
        do {
            System.out.println("I think about letter from A to Z. Try to guess");
            
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            if (ch == answer) System.out.println("Correct");
            else {
                System.out.print("No letter is ");
                if(ch < answer)
                    System.out.println("closer to Z");
                else 
                    System.out.println("closer to A");
                System.out.print("Please try again");
            }
        } while(answer != ch);
    }
}