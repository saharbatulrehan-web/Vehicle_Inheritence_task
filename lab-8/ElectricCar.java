      //subclass
    public class ElectricCar extends Car{
       //variables
     double batteryCapacity;
     int chargingTime;
 
       //constructor
     public ElectricCar(String brand, double speed,int numberOfDoors, String fuelType,double batteryCapacity,int chargingTime){
       
             super(brand, speed, numberOfDoors, fuelType);
             this.batteryCapacity= batteryCapacity;
             this.chargingTime= chargingTime; 
  
     } 

        //overriding methods
      //@Override
       public void display(){
              super.display();
              System.out.println("Battery Capacity: " + batteryCapacity + " Ampere-hrs " + " Charging Time: " + chargingTime + " hrs");
      } 

       //@Override
       public String toString(){

              return super.toString() +  "Battery Capacity: " + batteryCapacity +  " Charging Time: " + chargingTime;

       } 

   }