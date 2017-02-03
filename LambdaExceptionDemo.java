import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String args[]) {
        double[] values = { 1.3, 3.4, 5.4, 45.5, 45.6 };
        
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            System.out.println("Ok " + ch);
            return true;
        };
        try {
            myIO.ioAction(new BufferedReader(new InputStreamReader(System.in)));
            String str = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            System.out.println("Ok " + str);
        } catch(IOException exc) {
            System.out.println(exc);
        }
        
    }
}