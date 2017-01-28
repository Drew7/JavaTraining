class Vehicle {
    int passengers, fuelcap, mpg;
    
    int range() {
        return fuelcap * mpg;
    }
    
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
 }
 
 
 class AddMeth {
     public static void main(String args[]) {
         Vehicle minivan = new Vehicle();
         Vehicle sportscar = new Vehicle();
         double gallons;
         int range1, range2, dist = 252;
         
         minivan.passengers = 7;
         minivan.fuelcap = 16;
         minivan.mpg = 21;
         
         sportscar.passengers = 2;
         sportscar.fuelcap = 14;
         sportscar.mpg = 12;
         
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