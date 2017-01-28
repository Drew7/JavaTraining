import java.util.Calendar;

class HowOldAreYou {
    public static void main(String args[]) {
        Calendar dateOfBirth = Calendar.getInstance(); 
        Calendar rightNow    = Calendar.getInstance(); 
        
        dateOfBirth.set(2017, 1, 16);
        System.out.println(dateOfBirth);
        System.out.println(rightNow);
        int timeFromDate = rightNow.compareTo(dateOfBirth);
        
        System.out.println(timeFromDate);
        System.out.println();
        System.out.println((rightNow.getTimeInMillis() - dateOfBirth.getTimeInMillis())/1000/60/60/24);
        
    }
}