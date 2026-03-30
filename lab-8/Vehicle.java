  //Superclass 
  public class Vehicle{

         //variables
        String brand;
        double speed;

         //constructor
        public Vehicle(String brand, double speed){

               this.brand=brand;
               this.speed=speed;

        }


        //methods
        public void start(){
             
               System.out.println("Starting Vehicle....");
      
        }


       public void stop(){

              System.out.println("Vehicle stopped.");
       }

       public void display(){
              System.out.println("Display Called"); 
              System.out.println("Brand: " + brand + " Speed: " + speed + " km/h");
      
       }

      //overriding toString
       //@override
       public String toString(){
       
              return "Vehicle [ " + "Brand: " + brand + " Speed: " + speed + " ]";
       }
         

  }