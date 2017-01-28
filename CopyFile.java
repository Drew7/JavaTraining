import java.io.*;

class CopyFile {
    public static void main(String args[]) {
        int i;
        
        if(args.length != 2) {
            System.out.println("Usage: CopyFile <start_file> <target_file>");
            return;
        }
        
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Input/Output error: " + exc);
        } /*finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Closing error for input file");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Closing error for output file");
            }
        }*/
    }
}