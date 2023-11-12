import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<Vehicle>();

        System.out.println("1. Rent a Car\n" +
                "2. Rent a Bike\n" +
                "3. Rent a Truck\n" +
                "4. View Rented Vehicles\n"+ "5. Exit");

        int num = S.nextInt();
    do {

            switch (num) {


                case 1:
                    System.out.println("Enter Car Model: ");
                    String model = S.next();

                    System.out.println("Enter Rental Days: ");
                    int days = S.nextInt();

                    Vehicle car = new Car(model, days);
                    System.out.println("Rental Details: ");
                    car.displayDetails();
                    System.out.println("Rental Cost: " + "$" + car.calculateRentalCost());
                    rentedVehicles.add(new Car(model, days));
                    break;
                case 2:
                    System.out.println("Enter Bike Brand: ");
                    String brand1 = S.next();
                    System.out.println("Hourly Rental Rate: ");
                    int hour1 = S.nextInt();
                    Vehicle bike = new Bike(brand1, hour1);
                    System.out.println("Rental Details: ");
                    bike.displayDetails();
                    System.out.println("Rental Cost: " + "$" + bike.calculateRentalCost());
                    rentedVehicles.add(bike);
                    break;
                case 3:

                    System.out.println("Enter Truck type: ");
                    String type = S.next();

                    System.out.println("week Rental Rate: ");
                    int week = S.nextInt();

                    Vehicle truck = new Truck(type, week);
                    System.out.println("Rental Details: ");
                    truck.displayDetails();
                    System.out.println("Rental Cost: " + "$" + truck.calculateRentalCost());
                    rentedVehicles.add(truck);
                    break;
                case 4:

                    if(rentedVehicles.size() == 0){
                        System.out.println("No Rented Vehicles");
                    }
                    else

                    for (Vehicle V : rentedVehicles){
                        V.displayDetails();
                    System.out.println("Rental Cost: " + "$" + V.calculateRentalCost());

            }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
            }
            System.out.println("1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" + "5. Exit");
            num = S.nextInt();

        }  while (num != 5);


        System.out.println("Thank you for using the Vehicle Rental System!");

    }
}