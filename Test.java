enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    
    private int speed;
    
    Transport(int s) { speed = s; }
    
    int getSpeed() { return speed; }
}

class EnumDemo3 {
    public static void main(String args[]) {
        Transport tp, tp2, tp3;
        
        System.out.println("Values of Transport: ");
        
        Transport allTransports[] = Transport.values();
        for(Transport t : allTransports) {
            System.out.println("Speed of " + t + ": " + t.getSpeed() + " miles per hour");
            System.out.println(t.ordinal());
        }
       
        System.out.println();
        
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp equals to: " + tp);
        
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;
        
        if(tp.compareTo(tp2) < 0)
            System.out.println(tp + " is before " + tp2);
        else if(tp.compareTo(tp2) < 0)
            System.out.println(tp2 + " is before " + tp);
        
        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals to " + tp3);
        
        if(tp == Transport.TRAIN)
            System.out.println("tp equals to TRAIN\n");
        
        switch(tp) {
            case CAR:
                System.out.println("CAR transfer people");
                break;
            case TRUCK:
                System.out.println("TRUCK transfer cargo");
                break;
            case AIRPLANE:
                System.out.println("AIRPLANE flys");
                break;
            case TRAIN:
                System.out.println("TRAIN rides on rails");
                break;
            case BOAT:
                System.out.println("BOAT floats on water");
                break;
        }
    }
}