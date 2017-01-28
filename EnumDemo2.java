enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String args[]) {
        Transport tp;
        
        System.out.println("Values of Transport: ");
        
        Transport allTransports[] = Transport.values();
        for(Transport t : allTransports)
            System.out.println(t);
        
        System.out.println();
        
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp equals to: " + tp);
        
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