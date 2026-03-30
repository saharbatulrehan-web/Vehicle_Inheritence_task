  //Main class
    public class Demo{
           public static void main(String[] args){

           Vehicle v = new Vehicle("Toyota", 172.5);
           Car c = new Car("Toyota", 172.5, 4, "Hi Octane");
           ElectricCar ec = new ElectricCar("Toyota", 172.5, 4, "Hi Octane", 50, 12);

     
        System.out.println("\n--- Vehicle ---");
        v.start();
        v.display();
        System.out.println(v);
        v.stop();
          

        System.out.println("\n--- Car ---");
        c.display();
        System.out.println(c);
        System.out.println("\n--- Electric Car ---");
        ec.display();
        System.out.println(ec);


   }


  }