class StrOps {
    public static void main(String args[]) {
        String str1 = "Java is internet leader.";
        String str2 = new String(str1);
        String str3 = "Java strings are effective.";
        
        int str1L = str1.length(), result, idx;
        char ch;
        
        System.out.println("Length of str1: " + str1L);
        
        for(int i = 0; i < str1L; i++)
            System.out.println(str1.charAt(i));
        
        if(str1.equals(str2))
            System.out.println("str1 equals to str2");
        else
            System.out.println("str1 doesn't equal to str2");
        
        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 & str3 are the same");
        else if(result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is bigger than str3");
        
        str2 = "One Two Three Four";
        
        idx = str2.indexOf("Three");
        System.out.println("Index of first Three is: " + idx);
        
        idx = str2.lastIndexOf("Three");
        System.out.println("Index of last Three is: " + idx);
        
    }
}