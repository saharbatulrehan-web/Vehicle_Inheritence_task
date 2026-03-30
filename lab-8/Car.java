   //subclass
   public class Car extends Vehicle{
    
   //variables
     int numberOfDoors;
     String fuelType;

   //constructor
     public Car(String brand, double speed,int numberOfDoors, String fuelType){
            super(brand, speed);
            this.numberOfDoors= numberOfDoors;
            this.fuelType = fuelType;

     }    

   //overriding methods
     //@override
     public void display(){
      
            super.display();
            System.out.println("Number of Doors: " + numberOfDoors + " Fuel-type: " + fuelType);
     } 


    // @Override
     public String toString(){
     
            return super.toString() + n "Number of Doors: " + numberOfDoors + " Fuel-type: " + fuelType;

     } 

   }