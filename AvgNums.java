import java.io.*;

class AvgNums {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        
        System.out.println("How much numbers you will put down: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch(NumberFormatException exc) {
            System.out.println("Incorrect format");
            n = 0;
        }
        
        System.out.println("Entering " + n + " numbers");
        
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch(NumberFormatException exc) {
                System.out.println("Incorrect format");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is: " + avg + ". Sum is:" + sum);
    }
}