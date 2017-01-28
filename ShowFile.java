import java.io.*;

class ShowFile {
    public static void main(String ... args) {
        int i;
        
        if(args.length != 1) {
            System.out.println("Usage: ShowFile file_name");
            return;
        }
        
        try (FileInputStream fin = new FileInputStream(args[0])){
            
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException exc) {
            System.out.println("File not found.");
        } catch(IOException exc) {
            System.out.println("Input/Output error.");
        }               
    }
}