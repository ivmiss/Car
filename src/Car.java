public class Car {
 
    String model;
    int maxSpeed;
    int minSpeed;
    double weight;
    
    String license;
    int maxFuel;
    int currentFuel;
    int consumption; //consumption per distance unite(km)
    int mileage = 0;
    
    int maxPassengers;
    int currentPassengers;
    
    public Car() {
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        this.maxPassengers = 2;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentPassengers = 1;
        this.maxPassengers = 5;
    }
   
//    public Car(int customMaxPass, int customCurrNoPass){
//        this.maxPassengers = customMaxPass;
//        this.currentPassengers = customCurrNoPass;
//    }
    public Car(String customModel, int customMaxFuel, int customConsumption, 
            int customMaxPass, 
            int customCurrNoPass) 
    {
        this(customModel, customMaxFuel, customConsumption);
        this.maxPassengers = customMaxPass;
        this.currentPassengers = customCurrNoPass;
    }
    
    public void printAtributes() {
         System.out.println("Model: " + this.model);
         System.out.println("Fuel capacity: " + this.maxFuel);
         System.out.println("Consumption: " + this.consumption);
         System.out.println("License: " + this.license);
         System.out.println("Current fuel status: " + this.currentFuel);
         System.out.println("Weight: " + this.weight);
         System.out.println("Traveled distance: " + this.mileage);
         System.out.println();
         
    }
            
    public void changeLicense(String customLicense) {
         this.license = customLicense;   
    }       

    public void changeWeight(double newWeight) {
        this.weight = newWeight;
    }
    
    public double maxDistance() {
     double dist = this.maxFuel / this.consumption;
     return dist;
     
//     return this.maxFuel / this consumption;
    }
    
    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }
    
    public void travel(int distance){
//      ako ima dovoljna goriva putuj /povećaj mileage, smanji consumption/
//      ako nema dovoljno goriva onda ispiši poruku da nema dovoljno goriva
    if (this.currentFuel >= distance * this.consumption) {
        this.mileage = this.mileage + distance;
        this.currentFuel = this.currentFuel - distance * this.consumption;
    } else {
        System.out.println("No fuel left.\n");
    }
    }
    
    public void getIn(){ 
//        Da li ima mesta?
//        Ako ima
//               dodaj putnika i ispisi poruku
//        ako nema
//                ispisi poruku da nema mesta
        if(this.currentPassengers < this.maxPassengers){
            this.currentPassengers = this.currentPassengers + 1;
//            this.currentPassengers++;
        } else{
            System.out.println("There are no more free passengers's seads.\n");
        }
        
        this.printPassengersInfo();
    }
    
    public void getOut(){
//        Da li ima vise od jednog putnika?
//        Ako ima
//                oduzmi putnika
//        ako nema
//                ispisi da je nemoguce izvrsiti zahtev
        if(this.currentPassengers > 0){
            this.currentPassengers = this.currentPassengers - 1;
        } else{
            System.out.println("There are no more passengers.\n");
        }
        this.printPassengersInfo();
        
    }
    
   public void printPassengersInfo(){
<<<<<<< HEAD
       System.out.println("Current number : " + this.currentPassengers + " of maximum: " + this.maxPassengers);
   }

   public void getIn(int numberOfPassengers){
       if(this.currentPassengers + numberOfPassengers <= this.maxPassengers){
            this.currentPassengers = this.currentPassengers + numberOfPassengers;
//            this.currentPassengers++;
            System.out.println(numberOfPassengers + " got in. Current number: " + this.currentPassengers);
        } else{
            System.out.println("There are no more free passengers's seads.\n");
        }
   }
   
   public void getOut(int numberOfPassengers){
       if(this.currentPassengers >= numberOfPassengers){
            this.currentPassengers = this.currentPassengers - numberOfPassengers;
            System.out.println(numberOfPassengers + " got out. Current number: " + this.currentPassengers);
        } else{
            System.out.println("There are no space for " + numberOfPassengers + " passengers.\n");
        }
        this.printPassengersInfo();
   }
}
=======
       System.out.println("Current number of passengers: " + this.currentPassengers + " from maximum: " + this.maxPassengers);
   }

   public void getIn(int numberOfPass){
       if(this.maxPassengers >= this.currentPassengers + numberOfPass){
           this.currentPassengers = this.currentPassengers + numberOfPass;
           System.out.println(numberOfPass + " got in. Current number of passengers: " + this.currentPassengers);
       } else {
           System.out.println("There are no seeds for: " + numberOfPass +"passengers.\n" );
       }
   }
   
   public void getOut(int numberOfPass){
       if(this.currentPassengers >= numberOfPass) {
         this.currentPassengers = this.currentPassengers - numberOfPass;  
         System.out.println(numberOfPass + " got out. Current number of passengers: " + this.currentPassengers);
       }else {
           System.out.println("There are no " + numberOfPass + " passengers in the car.\n");
       }
      
   }
       
   }

>>>>>>> 79e15b2f0e4e1003f6a34be96c1d108054cf7d45
