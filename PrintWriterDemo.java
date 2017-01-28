import java.io.*;

public class PrintWriterDemo {
    public static void main(String ... args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Please, input symbols; ending symbol dot");
        
        do {
            c = (char) br.read();
            pw.println(c);
        } while(c != '.');
    }
}