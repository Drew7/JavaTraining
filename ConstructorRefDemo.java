interface MyFunc {
    MyClass func(String s);
}

class MyClass {
    private String str;
    
    MyClass(String s) { str = s; }
    
    MyClass() { str = ""; }
    
    String getStr() { return str; }
}

class ConstructorRefDemo {
    public static void main(String args[]) {
        MyFunc myClassCons = MyClass::new;
        
        MyClass mc = myClassCons.func("Testing");
        
        System.out.println("String str in mc: " + mc.getStr());
    }
}