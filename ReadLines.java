import java.io.*;

class ReadLines {
    public static void main(String ... args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("Please, input lines; ending symbol word stop");
        
        do {
            str = br.readLine();
            System.out.println(str);
            //bw.write(c);
        } while(!str.equals("stop"));
    }
}