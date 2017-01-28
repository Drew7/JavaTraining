class EggVoice extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch(InterruptedException e) {}
			
			System.out.println("egg!");	
		}
	}
}

class ChickenVoice extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch(InterruptedException e) {}
			
			System.out.println("chicken!");	
		}
	}
}

class Battle {
	    
	public static void main(String ... args) {
		EggVoice mAnotherOpinion = new EggVoice();
		ChickenVoice mAnotherOpinion2 = new ChickenVoice();
        System.out.println("Let's the battle begin...");
		mAnotherOpinion.start();
        mAnotherOpinion2.start();
		
        try {
            Thread.sleep(6000);
        } catch(InterruptedException e) {}
		
		System.out.println("The end!");	
	}
}