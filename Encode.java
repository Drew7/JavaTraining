class Encode {
    public static void main(String args[]) {
        String msg = "This is test";
        String encmsg = "";
        String decmsg = "";
        char[] key = {'D', 'r', 'e', 'w', '.', 'i', 'n', 'c'};
        
        System.out.println("Start message: " + msg);
        int msgLen = msg.length();
        int keyLen = key.length;
        
        for(int i = 0, k = 0; i < msgLen; i++, k++){
            if(k == keyLen) k = 0;
            encmsg = encmsg + (char) (msg.charAt(i) ^ key[k]);
        }
        System.out.println("Encoded message: " + encmsg);
        
        for(int i = 0, k = 0; i < msgLen; i++, k++){
            if(k == keyLen) k = 0;
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key[k]);
        }        
        
        System.out.println("Decoded message: " + decmsg);
        
    }
}