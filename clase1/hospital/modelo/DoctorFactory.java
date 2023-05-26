package clase1.hospital.modelo;

public class DoctorFactory {
    public static Doctor createDoctor(String name, String specialization) {
        return new Doctor(name, specialization);
    }
}
