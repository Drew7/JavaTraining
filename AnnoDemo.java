@Deprecated
class MyClass {
    private String msg;
    
    MyClass(String m) {
        msg = m;
    }
    
    @Deprecated
    String getMsg() {
        return msg;
    }
}

class AnnoDemo {
    public static void main(String args[]) {
        MyClass myObj = new MyClass("Anno demo class");
        System.out.println(myObj.getMsg());
    }
}