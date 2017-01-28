interface Vehicles {
   int range();
   double fuelneeded(int miles);
}

class Vehicle implements Vehicles {
    int passengers, fuelcap, mpg;
    
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    public int range() {
        return fuelcap * mpg;
    }
    
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
 }
 
 
 class VehConsDemo {
     public static void main(String args[]) {
         Vehicle minivan = new Vehicle(7, 16, 21);
         Vehicle sportscar = new Vehicle(2, 16, 21);
         double gallons;
         int range1, range2, dist = 252;
                  
         range1 = minivan.range();
         range2 = sportscar.range();
         
         System.out.println("Minivan can transport " + minivan.passengers + " passengers for " + range1 + " miles.");
                  
         System.out.println("Sportscar can transport " + sportscar.passengers + " passengers for " + range2 + " miles.");
         
         gallons = minivan.fuelneeded(dist);
         
         System.out.println("To drive " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
         
         gallons = sportscar.fuelneeded(dist);
         
         System.out.println("To drive " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
         
     }
 }