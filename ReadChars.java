import java.io.*;

class ReadChars {
    public static void main(String ... args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("Please, input symbols; ending symbol dot");
        
        do {
            c = (char) br.read();
            System.out.println(c);
            //bw.write(c);
        } while(c != '.');
    }
}