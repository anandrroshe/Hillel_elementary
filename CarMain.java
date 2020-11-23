public class CarMain {

    public static void main(String[] args) {
       int totalCoastTrip = 0;
       int priceFuel = 30;
       Car myCar = new Car(50, 20, 10);
       totalCoastTrip = priceFuel * myCar.fillTank();
       System.out.println("Lets fill the tank to full, refueling cost out: "+ totalCoastTrip + " UAH.");
       System.out.print("Fuel left after first 200 km in Krivoe Ozero " + myCar.fuelRemaining(200) + " l. ");
       totalCoastTrip += priceFuel * myCar.fuelNeeds(200);
       System.out.println("Total coast of trip " + totalCoastTrip+ "UAH.");
       System.out.print("Fuel left after next 200 km in Zhashkov " + myCar.fuelRemaining(200) + " l. ");
       totalCoastTrip += priceFuel * myCar.fuelNeeds(200);
       System.out.println("Total coast of trip " + totalCoastTrip+ "UAH.");
       System.out.print("Fuel left after next 400 km in Kiev " + myCar.fuelRemaining(400) + " l. ");
       totalCoastTrip += priceFuel * myCar.fuelNeeds(400);
       System.out.println("Total coast of trip from Odessa to Kiev is " + totalCoastTrip+ "UAH.");



    }

}