import java.io.*;

class KtoD {
    public static void main(String ... args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input lines; ending symbol word stop");
        
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                
                if(str.compareTo("stop") == 0) break;
                
                str = str + "\r\n";
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("Input/output error: " + exc);
        }
    }
}