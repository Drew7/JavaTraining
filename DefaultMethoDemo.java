class MyIfImp implements MyIf {
    public int getUserID() {
        return 100;
    }
}

class MyIfImp2 implements MyIf {
    public int getUserID() {
        return 100;
    }
    public int getAdminID() {
        return 32;
    }
}

class DefaultMethoDemo {
    public static void main(String ... args) {
        MyIfImp obj = new MyIfImp();
        System.out.println("User ID: " + obj.getUserID());
        System.out.println("Admin ID: " + obj.getAdminID());
        
        MyIfImp2 obj2 = new MyIfImp2();
        System.out.println("User ID: " + obj2.getUserID());
        System.out.println("Admin ID: " + obj2.getAdminID());
    }
}