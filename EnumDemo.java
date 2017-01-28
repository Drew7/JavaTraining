enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo {
    public static void main(String args[]) {
        Transport tp;
        
        tp = Transport.AIRPLANE;
        
        System.out.println("Value of tp: " + tp);
        System.out.println();
        
        tp = Transport.TRAIN;
        
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