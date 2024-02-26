/**
 * Program #2C
 * Testing Incremental Development
 * CS160 - Section #3
 * @author Alex Huang
 */

public class FancyCar{

   // Declare private fields
   private final int FULL_TANK = 14;
   private int odometer;
   private double gallons_of_gas;
   private double miles_per_gallon;
   private String car_model;

   private boolean is_engine_on;

   // Default constructor
   public FancyCar() {
      odometer = 5;
      gallons_of_gas = FULL_TANK;
      miles_per_gallon = 24.0;
      car_model = "Old Clunker";
      is_engine_on = false;
   }
   
   // Constructor (String make, double mpg)
   public FancyCar(String make, double mpg) {
      this.car_model = make;
      this.miles_per_gallon = mpg;
      odometer = 5;
      gallons_of_gas = FULL_TANK;
      is_engine_on = false;

   }

   // Return car model
   public String getModel() {
      return car_model;
   }
    
   // Return miles per gallon (MPG)      
    public double getMPG(){
       return miles_per_gallon;
    }
    
   // Return miles on odometer    
   public int checkOdometer() {
      return odometer;
   } 
         
   // Return amount of gas in tank
   public double checkGasGauge() {
      return gallons_of_gas;
   }   
   
   // Honk horn
   public void honkHorn() {
      System.out.println("The " + getModel() + " says beep beep!");
   }
   
   // Drive car requested miles but check for enough
   // gas and check for positive value
   public void drive(int milesToDrive) {

      if (milesToDrive > 0 && is_engine_on) {
         double total_drivable_distance = getMPG() * checkGasGauge();

         if (total_drivable_distance < milesToDrive) {
            odometer += (int) total_drivable_distance;
         } else {
            odometer += milesToDrive;
         }


         if (milesToDrive > total_drivable_distance) {
            gallons_of_gas = 0.0;
            stopEngine();
         } else {
            gallons_of_gas -= milesToDrive / miles_per_gallon;
         }
      }
    }
 
   // Add gas to tank. Check for positive value.
   public void addGas(double amtToAdd) {
      if (amtToAdd > 0 && !is_engine_on) {
         gallons_of_gas += amtToAdd;
      }

      if (amtToAdd + gallons_of_gas > FULL_TANK) {
         gallons_of_gas = FULL_TANK;
      }
   }
      
   // Set boolean variable to true
    public void startEngine(){
       is_engine_on = true;
    }
      
   // Set boolean variable to false  
   public void stopEngine(){
      is_engine_on = false;
   } 
    
}