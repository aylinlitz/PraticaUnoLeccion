package ec.edu.espoch.practicauno;

public class Routes {

    public String date;
    public String deliveryArea;
    public double distanceTravel;
    public int numPackaTrans;
    public int estimTripTime;
    public Vehicle v;
    public Driver driver;

    public Routes(String date, String deliveryArea, double distanceTravel, int numPackaTrans, int estimTripTime, Vehicle v, Driver driver) {
        this.date = date;
        this.deliveryArea = deliveryArea;
        this.distanceTravel = distanceTravel;
        this.numPackaTrans = numPackaTrans;
        this.estimTripTime = estimTripTime;
        this.v = v;
        this.driver = driver;
    }

    public void printRoutes() {
        System.out.println("Fecha: " + date);
        System.out.println("Area: " + deliveryArea);
        System.out.println("Distancia: " + distanceTravel);
        System.out.println("Paquetes: " + numPackaTrans);
        System.out.println("Tiempo estimado: " + estimTripTime);
        System.out.println("Vehiculo asignado: " + v.licensePlate);
        System.out.println("Conductor: " + driver.firstName + " " + driver.lastName);
    }
}
