import java.io.*;

class Help {
    String helpfile;
    
    Help(String fname) {
        helpfile = fname;
    }
    
    boolean helpon(String what) {
        int ch;
        String topic, info;
        
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = helpRdr.read();
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));
                            return true;
                    }
                }
            } while(ch != -1);
        } catch(IOException exc) {
            System.out.println("Access error.");
            return false;
        }
        return false;
    }
    
    String getSelection() {
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Select topic: ");
        try {
            topic = br.readLine();
        } catch(IOException exc) {
            System.out.println("Console reading error");
        }
        return topic;
    }
}

class FileHelp {
    public static void main(String args[]) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;
        System.out.println("Use help system.\n" + "For exit input 'stop'");
        do {
            topic = hlpobj.getSelection();
            if(!hlpobj.helpon(topic))
                System.out.println("Topic not found\n");
        } while(topic.compareTo("stop") != 0);
    }
}