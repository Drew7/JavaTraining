interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
    
    public static void main(String args[]) {
        
        String inStr = "Now I understand what is Lambda";
        String outStr;
        
        System.out.println("Inbox string is: '" + inStr + "'.");
        
        StringFunc reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        
        outStr = changeStr(reverse, inStr);
        System.out.println("Outbox string is: '" + outStr + "'.");
        
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        
        System.out.println("Outbox string without spaces: '" + outStr + "'.");
        
        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            
            for(int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        
        System.out.println("String with reversed symbols is: '" + outStr + "'.");
        
    }
    
}