package ec.edu.espoch.practicauno;

public class PracticaUno {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Maria", "Riera",1678, 045672, 10);
        Vehicle vehicle1 = new Vehicle(7, "JGUR-6793", "chevrolet", 200);
        Routes routes1 = new Routes("14-4-2026", "Moretal", 30.1, 60, 60, vehicle1, driver1);
        System.out.println("-----------------------------");
        System.out.println("DRIVER DATA");
        driver1.printDriver();
        System.out.println("-----------------------------");

        System.out.println("VEHICLE DATA");
        vehicle1.printVehicle();
        System.out.println("-----------------------------");

        System.out.println("ROUTE DATA");
        routes1.printRoutes();
        System.out.println("-----------------------------");

        System.out.println("Total deliveries of the driver: " + driver1.calcularEntregas());
        System.out.println("-----------------------------");
    }
}
