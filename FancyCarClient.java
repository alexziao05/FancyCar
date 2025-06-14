/**
 * Program #2C
 * Testing Incremental Development
 * CS160 - Section #3
 * @author Alex Huang
 */

class FancyCarClient {
   public static void main(String[] args) {
      FancyCar car = new FancyCar();

      car.startEngine();
      car.drive(100);
      System.out.println("Miles driven: " + car.checkOdometer());
      System.out.println("Gas Tank: " + car.checkGasGauge() + " gallons");

      car.stopEngine();
      car.addGas(2);
      System.out.println("New Gas Tank: " + car.checkGasGauge() + " gallons");

      FancyCar myDreamCar = new FancyCar("Toyota", 52);
      myDreamCar.honkHorn();
   }
}
