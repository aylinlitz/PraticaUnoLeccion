package ec.edu.espoch.practicauno;

public class Driver {

    public String firstName;
    public String lastName;
    public int id;
    public int licenseNumber;
    public int yearExperience;
    public int numEntregas = 0;

    public Driver() {
    }

    public Driver(String firstName, String lastName, int id, int licenseNumber, int yearExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.licenseNumber = licenseNumber;
        this.yearExperience = yearExperience;
    }

    public void printDriver() {
        System.out.println("Nombre del conductor: " + firstName);
        System.out.println("Apellido del conductor: " + lastName);
        System.out.println("Identificacion: " + id);
        System.out.println("Licencia: " + licenseNumber);
        System.out.println("Anos de experiencia: " + yearExperience);
        System.out.println("Numero de entregas realizadas: " + numEntregas);
    }

    public void registrarEntrega(int cantidad) {
        numEntregas = numEntregas + cantidad;
    }

    public int calcularEntregas() {
        return numEntregas;
    }
}
