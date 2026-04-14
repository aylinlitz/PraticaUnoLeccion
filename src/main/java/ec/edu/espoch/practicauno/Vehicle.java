package ec.edu.espoch.practicauno;

public class Vehicle {

    public int internalCode;
    public String licensePlate;
    public String brand;
    public double maxLoadCapacity;
    public int batteryL = 100;
    public String states;

    public Vehicle(int internalCode, String licensePlate, String brand, double maxLoadCapacity) {
        this.internalCode = internalCode;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.maxLoadCapacity = maxLoadCapacity;
        this.batteryL = 100;
        this.states = "OFF";
    }

    public void enceder() {
        if (batteryL > 0) {
            states = "ON";
        } else {
            System.out.println("There can't be a battery");
        }
    }

    public void apagar() {
        states = "OFF";
    }

    public void usarBateria(int consumo) {
        batteryL -= consumo;
        if (batteryL < 0) {
            batteryL = 0;
        }
    }

    public void printVehicle() {
        System.out.println("Codigo interno: " + internalCode);
        System.out.println("Placa: " + licensePlate);
        System.out.println("Marca: " + brand);
        System.out.println("Maxima carga de capacidad: " + maxLoadCapacity);
        System.out.println("Bateria: " + batteryL);
        System.out.println("Estado: " + states);
    }
}
