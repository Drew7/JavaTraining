class FindSpaces {
    public static void main(String args[]) throws java.io.IOException {
        char choice;
        int qSpaces = 0;
        do {
            choice = (char) System.in.read();
            if(choice == ' ') qSpaces++;
        } while(choice != '.');
        System.out.println("There were " + qSpaces + " spaces");
    }
}