public interface MyIf {
    int getUserID();
    
    default int getAdminID() {
        return 1;
    }
}