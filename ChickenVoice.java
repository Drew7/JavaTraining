class EggVoice extends Thread {
 @Override
 public void run() {
  for (int i = 0; i < 5; i++) {
   try {
    sleep(1000);
   } catch (InterruptedException e) {}

   System.out.println("egg!");
  }

 }
}

class ChickenVoice {

 public static void main(String[] args) {
  EggVoice mAnotherOpinion = new EggVoice();
  System.out.println("Let's the battle begin...");
  mAnotherOpinion.start();

  for (int i = 0; i < 5; i++) {
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {}

   System.out.println("chicken!");
  }



  if (mAnotherOpinion.isAlive()) {
   try {
    mAnotherOpinion.join();
   } catch (InterruptedException e) {}

   System.out.println("First there was the egg!");
  } else {
   System.out.println("First there was the chicken!");
  }
  System.out.println("The end!");
 }
}