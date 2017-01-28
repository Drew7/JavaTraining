class RecurseStr {
    
    static void strLastSymb(String str){
        strStack(str, str.length() - 1);
    }
    
    private static void strStack(String str, int nChar){
        System.out.print(str.charAt(nChar));
        if(nChar > 0) {
            nChar--;
            strStack(str, nChar);
        }
    }
}

class RecurseDemo {
    public static void main(String args[]){
        String str = "String for stack";
        RecurseStr.strLastSymb(str);
    }
}