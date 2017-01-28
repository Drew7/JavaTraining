import java.io.*;

class CompFiles {
    public static void main(String ... args) {
        int i = 0, j = 0;
        
        if(args.length != 2) {
            System.out.println("Usage: CompFiles <file_1> <file_2>");
            return;
        }
        
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])) {
                
                do {
                    i = f1.read();
                    j = f2.read();
                    if(i != j) break;
                } while(i != -1 && j != -1);
                if(i != j)
                    System.out.println("Files are different.");
                else
                    System.out.println("Files are similar.");
            } catch(IOException exc) {
                System.out.println("Input/Output error: " + exc);
            }
    }
}