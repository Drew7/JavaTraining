class Vehicle {   
  private int passengers; // number of passengers   
  private int fuelcap;    // fuel capacity in gallons  
  private int mpg;        // fuel consumption in miles per gallon  
  
  // This is a constructor for Vehicle. 
  Vehicle(int p, int f, int m) { 
    passengers = p; 
    fuelcap = f; 
    mpg = m; 
  } 
  
  int getPassengers() { return passengers; }
  int getFuelcap() { return fuelcap; }
  int getMpg() { return mpg; }
  
  void setPassengers(int p) { passengers = p; }
  void setFuelcap(int f) { fuelcap = f; }
  void setMpg(int m) { mpg = m; }
  
  
  // Return the range.  
  int range() {  
    return mpg * fuelcap;  
  }  
  
  // Compute fuel needed for a given distance. 
  double fuelneeded(int miles) {  
    return (double) miles / mpg;  
  }  
}   

class Truck extends Vehicle {
    private int cargocap;
    
    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }
    
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        
        double gallons;
        int dist = 252;
        
        gallons = semi.fuelneeded(dist);
        
        System.out.println("Semi can lift " + semi.getCargo() + " funts.");  
        System.out.println("To go " + dist + " miles semi needs " +  
                       gallons + " gallons of fuel.");  
        
        gallons = semi.fuelneeded(dist);
        
        System.out.println("Pickup can lift " + pickup.getCargo() + " funts.");  
        System.out.println("To go " + dist + " miles pickup needs " +  
                       gallons + " gallons of fuel.");  
    }
}