import java.io.*;

class ReadBytes {
    public static void main(String args[]) throws IOException {
        byte data[] = new byte[10];
        //byte data[];
        
        System.out.println("Please, input data.");
        System.in.read(data);
        System.out.print("Your input data: ");
        for(int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);
        
    }
}