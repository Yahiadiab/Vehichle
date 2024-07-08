import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter weight load: ");
        int weightLoad = scanner.nextInt();

        Vehicle vehicle;

        if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(weightLoad);
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(weightLoad);
        } else {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Weight load for your vehicle " + vehicle.getVehicleWeightLoad());
    }
}
