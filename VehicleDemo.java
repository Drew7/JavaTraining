class Vehicle {
    int passengers, fuelcap, mpg;
 }
 
 
 class VehicleDemo {
     public static void main(String args[]) {
         Vehicle minivan = new Vehicle();
         int range;
         
         minivan.passengers = 7;
         minivan.fuelcap = 16;
         minivan.mpg = 21;
         
         range = minivan.fuelcap * minivan.mpg;
         System.out.println("Minivan can transport " + minivan.passengers + " passengers for " +
         range + " miles");
     }
 }